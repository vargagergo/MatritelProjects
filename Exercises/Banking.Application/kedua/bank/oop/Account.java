package kedua.bank.oop;

public class Account {

    public final static double NEW_BALANCE_VALUE = 0.0d;

    private String iban;
    private String currency;
    private double balance;

    public Account(String iban, String currency, double balance) {
        this.iban = iban;
        this.currency = currency;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
