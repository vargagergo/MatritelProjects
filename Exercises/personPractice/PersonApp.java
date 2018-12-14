package personPractice;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Person firstPerson = new Person(readPersonSurname(), readPersonFamilyname());
        Person secondPerson = new Person(readPersonSurname(), readPersonFamilyname());
        Person thirdPerson = new Person(readPersonSurname(), readPersonFamilyname());

        System.out.println(firstPerson.getUkName());
        System.out.println(secondPerson.getUkName());
        System.out.println(thirdPerson.getUkName());
    }

    static  String readPersonSurname(){
        System.out.println("Please enter your surname: ");
        Scanner reading = new Scanner(System.in);
        String name = reading.nextLine();
        return name;
    }

    static  String readPersonFamilyname(){
        System.out.println("Please enter your familyname: ");
        Scanner reading = new Scanner(System.in);
        String name = reading.nextLine();
        return name;
    }
}
