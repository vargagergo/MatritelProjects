package accounts;

public class Hacker extends Account {

    int balance  ;
    String name  ;

    public Hacker(){
    }

    public Hacker(String name,int balance){
        this.name = "John Doe";
        this.balance = 1000000;
        System.out.println("New balance was created: "+ balance);

    }

}
