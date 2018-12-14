package kedua.bank.oop;
import kedua.bank.oop.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Bank {

    private Map<String, Person> personInfoDatabase;
    private Map<String, Map<String, Account>> accountDatabase;

    public Bank() {
        personInfoDatabase = new HashMap<>();
        personInfoDatabase.put("1234", new Person("1","Joe", "Itt"));
        personInfoDatabase.put("1234", new Person("2","Joe", "Itt"));
        accountDatabase = new HashMap<>();
    }

    public void apply() {
        System.out.print("Name ?");
        String nameRead = new Scanner(System.in).next();
        System.out.print("Address ?");
        String adressRead = new Scanner(System.in).next();
        String personId = "user-" + Math.random() * 10000;
        Person newPerson = new Person(personId, nameRead, adressRead);
        personInfoDatabase.put(personId, newPerson);

        String newAccountNumber = "account-" + Math.random() * 10000;
        double newBalance = Account.NEW_BALANCE_VALUE;
        System.out.print("Currency ?");
        String currencyRead = new Scanner(System.in).next();
        Account newAccount = new Account(newAccountNumber, currencyRead, newBalance);
        Map<String, Account> middleMap = new HashMap<>();
        middleMap.put(newAccountNumber, newAccount);
        accountDatabase.put(personId, middleMap);

        // EXERCISE 02 Extend the apply() to check whether the user already exists and if it does only create the account!
    }

    public Person findPerson(String name,String address) {


        for (Entry<String,Person> entries : personInfoDatabase.entrySet()) {
            if (entries.getValue().getName().equals(name) && entries.getValue().getAddress().equals(address) ) {
                //System.out.println( "I've found : " + entries.getValue().getPersonId() + entries.getValue().getName() +  entries.getValue().getAddress());
                return entries.getValue();
            }else {
                System.out.println("HAHA there is no " + name);
                break;
            }
        }



        return null;
    }

    public void deposit(double amount,String iban) {

        for(Map.Entry<String, Map<String,Account>> t : accountDatabase.entrySet()) {
            for (Entry<String,Account> entries : t.getValue().entrySet()) {
                if (entries.getValue().getIban().equals(iban)) {
                    entries.getValue().setBalance(entries.getValue().getBalance() + amount);
                    System.out.println("Your balance has been increased by " + amount );
                }
        }
    }
}




    public void withdraw(double amount,String iban) {
        for(Map.Entry<String, Map<String,Account>> t : accountDatabase.entrySet()) {
            for (Entry<String,Account> entries : t.getValue().entrySet()) {
                if (entries.getValue().getIban().equals(iban)) {
                    entries.getValue().setBalance(entries.getValue().getBalance() - amount);
                    System.out.println("Your balance has been increased by " + amount );
                }
            }
        }
    }

    public void transfer(String ibanSend, String ibanRecieve,double amount) {

        for(Map.Entry<String, Map<String,Account>> t : accountDatabase.entrySet()) {
            for (Entry<String,Account> entries : t.getValue().entrySet()) {
                if (entries.getValue().getIban().equals(ibanSend) ) {
                    entries.getValue().getIban().equals(ibanRecieve);
                    entries.getValue().setBalance(entries.getValue().getBalance() + amount);
                    System.out.println("Your balance has been increased by " + amount );
                }
            }
        }

    }

    public void printBankState() {
        for (Entry<String, Person> entries : personInfoDatabase.entrySet() ) {
            System.out.println("personInfoDatabase = " + entries.getKey() + " : " + entries.getValue().getName());
        }
        for(Map.Entry<String, Map<String,Account>> t : accountDatabase.entrySet()) {
            for (Map.Entry<String,Account> e : t.getValue().entrySet())
                System.out.println(" VALUE:" +e.getValue().getCurrency() + " " + e.getValue().getIban() + " " + e.getValue().getBalance() );
        }
    }
}

