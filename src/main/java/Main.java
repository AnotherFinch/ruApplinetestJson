import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GsonBuilder gsonB = new GsonBuilder();
        gsonB.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonB.create();
        ArrayList<Company> companies;
        companies = gson.fromJson(new FileReader("src/main/java/Companies.json"), new TypeToken<List<Company>>() {
        }.getType());
        companies.forEach(System.out::println);
        System.out.println();
        companies.forEach((s) -> s.getSecurities().stream()
                .filter((d) -> d.getDate_to().isBefore(LocalDate.now()))
                .forEach(System.out::println));
        ArrayList<ArrayList<Security>> sec = new ArrayList<>();
        for (Company c : companies) {
            sec.add(c.getSecurities());
        }
        int count = 0;
        for (ArrayList<Security> s : sec) {
            for (Security s1 : s) {
                if (s1.getDate_to().isBefore(LocalDate.now())) {
                    count++;
                }
            }
        }
        System.out.println("Количество аннулированных ценных бумаг : " + count);
        String userDate = "05.05.2002";
        System.out.println();
        companies.stream().filter((c) -> c.getEgrul_date()
                .isAfter(LocalDateDeserializer.parseStringToDate(userDate)))
                .forEach(System.out::println);
        String usd = "USD";
        System.out.println();
        companies.forEach((c)->c.getSecurities()
                .stream().filter((security)->security.getCurrency().getCode().equals(usd))
                .forEach((secur)->System.out.println(secur.getId() + " " + secur.getCode())));
    }
}