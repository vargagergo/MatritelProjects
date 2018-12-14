package accounts;

public class Account {

    int balance;
    String name;

    public Account(String name,int balance){
        this.balance = balance;
        this.name = name;
        System.out.println("New balance was created: " + this.name + " with a balance of " + this.balance);


    }

    public Account() {

    }

    public void PrintBalance(){
        System.out.println(name + "'s balance is : " + balance);


    }
    public void AddMoney(int amount){
        balance += amount;

    }
    public void SendMoney(Account toAccount,int amount){

        balance -= amount;
        toAccount.AddMoney(amount);
        System.out.println(amount + " was sent to " + toAccount.name);


    }


}
