import kedua.bank.oop.Bank;
import kedua.bank.oop.Person;

import java.util.*;

public class BankApplication {


    public static void main(String[] args) {
        Bank theBank = new Bank();
        Person jani = new Person("1","Joe","here");
        Person jani2 = new Person("1","Joe","here");


        // apply for a new account
       // theBank.apply();
        //theBank.printBankState();
//      System.out.println(jani.toString());
//        System.out.println("jani = " + jani);
        System.out.println(jani2.equals(jani));

        Set<Person> persSet = new HashSet<>();
        persSet.add(jani);
        persSet.add(jani2);

        List<Person> persList = new ArrayList<>();

        persList.add(jani);
        persList.add(jani2);

        System.out.println(persList.size());
        System.out.println(persSet.size());


    }
}
