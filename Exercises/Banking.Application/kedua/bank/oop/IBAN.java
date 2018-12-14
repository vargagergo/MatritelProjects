package kedua.bank.oop;

public class IBAN {

    private String countryCode;
    private String swift;
    private String accountNumber;

    public IBAN(String countryCode, String swift, String accountNumber) {
        this.countryCode = countryCode;
        this.swift = swift;
        this.accountNumber = accountNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getSwift() {
        return swift;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIBAN() {
        return countryCode + swift + accountNumber;
    }

}
