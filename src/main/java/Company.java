import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Company {
    private int id;
    private String code;
    private String name_full;
    private String name_short;
    private long inn;
    private Company_type company_type;
    private long ogrn;
    private LocalDate egrul_date;
    private Country country;
    private String fio_head;
    private String address;
    private String phone;
    private String e_mail;
    private String www;
    private boolean is_resident;
    private ArrayList<Security> securities;

    public ArrayList<Security> getSecurities() {
        return securities;
    }

    public LocalDate getEgrul_date() {
        return egrul_date;
    }

    @Override
    public String toString() {
        return name_short + " - " + egrul_date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }

    public String getName_short() {
        return name_short;
    }

    public void setName_short(String name_short) {
        this.name_short = name_short;
    }

    public long getInn() {
        return inn;
    }

    public void setInn(long inn) {
        this.inn = inn;
    }

    public Company_type getCompany_type() {
        return company_type;
    }

    public void setCompany_type(Company_type company_type) {
        this.company_type = company_type;
    }

    public long getOgrn() {
        return ogrn;
    }

    public void setOgrn(long ogrn) {
        this.ogrn = ogrn;
    }

    public void setEgrul_date(LocalDate egrul_date) {
        this.egrul_date = egrul_date;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFio_head() {
        return fio_head;
    }

    public void setFio_head(String fio_head) {
        this.fio_head = fio_head;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public boolean isIs_resident() {
        return is_resident;
    }

    public void setIs_resident(boolean is_resident) {
        this.is_resident = is_resident;
    }

    public void setSecurities(ArrayList<Security> securities) {
        this.securities = securities;
    }
}