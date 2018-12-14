package wednesday.people;

public class Employee extends Person {
    private int id;
    public static int counter; //automatically incremented


    public Employee() {
        this.id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }
}
