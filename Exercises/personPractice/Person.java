package personPractice;

import java.util.Date;

public class Person {
    String surname;
    String familyName;
    //Date birthday;

    public Person(String surname, String familyName) {
        this.surname = surname;
        this.familyName = familyName;
        //this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getUkName(){
        return getSurname() + " "+ getFamilyName();

    }
}
