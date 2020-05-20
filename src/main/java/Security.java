import java.time.LocalDate;

class Security {
    private int id;
    private String code;
    private String name_full;
    private String cfi;
    private LocalDate date_to;
    private LocalDate state_reg_date;
    private State state;
    private Currency currency;

    public void setId(int id) {
        this.id = id;
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

    public String getCfi() {
        return cfi;
    }

    public void setCfi(String cfi) {
        this.cfi = cfi;
    }

    public void setDate_to(LocalDate date_to) {
        this.date_to = date_to;
    }

    public LocalDate getState_reg_date() {
        return state_reg_date;
    }

    public void setState_reg_date(LocalDate state_reg_date) {
        this.state_reg_date = state_reg_date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDate getDate_to() {
        return date_to;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + " " + date_to + " " + name_full;
    }

}