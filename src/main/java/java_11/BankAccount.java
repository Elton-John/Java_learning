package java_11;

public class BankAccount {
    private int id;
    private String name;
    private String surname;
    private String pesel;
    private double cash;


    public BankAccount(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public BankAccount(int id, String name, String surname, String pesel, double cash) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.cash = cash;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public double getCash() {
        return cash;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", cash=" + cash +
                '}';
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            cash = cash + amount;
        } else {
            System.out.println("suma powinna być większ niż 0");
        }
    }

    public double withdrawCash(double amount) {
        double withdrawCash;
        if (amount < cash && amount > 0) {
            cash = cash - amount;
            withdrawCash = amount;
        } else {
            withdrawCash = cash;
            cash = 0;
        }
        return withdrawCash;
    }

    public void printInfo() {
        String info = "Numer konta: " + id + "\n" + "Stan konta: " + cash;
        System.out.println(info);
    }
}
