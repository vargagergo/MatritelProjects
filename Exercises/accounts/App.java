package accounts;

public class App {
    public static void main(String[] args) {
        Account davidAccount = new Account("David",20000 );
        Account myBoss = new Account("Boss",100000);


        davidAccount.PrintBalance();
        myBoss.PrintBalance();

        davidAccount.AddMoney(23334);
        davidAccount.PrintBalance();

        myBoss.SendMoney(davidAccount,20000);
        davidAccount.PrintBalance();
        myBoss.PrintBalance();


        Account hackerAcc = new Hacker();


    }

}
