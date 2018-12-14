package kedua.bank.oop;

import java.util.List;
import java.util.Objects;

public class Person {



    private String personId; // = pid
    private String name;
    private String address;

    public Person(String id, String nameI, String addressI) {
        personId = id;
        name = nameI;
        address = addressI;
    }

    public Person() {

    }

    public void setName(String nameInput) {
        name = nameInput;
    }

    public void setAddress(String addressInput) {
        address = addressInput;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPersonId() {
        return personId;
    }


    public String toString() {
        return "PersonId: " + personId +" "+
                "Name: " + name +" "+
                "Address: " + address ;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass().equals(obj) && this.getPersonId().equals(((Person)obj).getPersonId())
                                        && this.getName().equals(((Person)obj).getName())
                                        && this.getAddress().equals(((Person)obj).getAddress())) {
            return true;
        }

        if (obj == null){
            return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 42;
        hash += 28 * getName().hashCode();
        hash += 28 * getAddress().hashCode();
        hash += 28 * getAddress().hashCode();
        return hash;
    }
}
