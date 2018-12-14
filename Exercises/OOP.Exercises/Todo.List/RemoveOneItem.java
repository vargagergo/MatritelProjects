package todolisttopic;

import java.util.Scanner;

public class RemoveOneItem extends CommandsWithParameters{

    public static boolean isInteger(String str) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(str);

            // s is a valid integer

            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            // s is not an integer
        }

        return isValidInteger;
    }


    @Override
    public void execute(String s) {
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty, you cannot remove anything from it.");
            return;
        }
        System.out.println("Please add the number of the task to remove: ");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();

        if (!isInteger(s)){
            System.out.println("This input is not a number! Nothing is removed.");
        } else {
            int userInput;
            userInput = Integer.parseInt(s);
            if (userInput > arrayToDoList.size() || userInput < 0) {
                System.out.println("There is no such number of element. Nothing is removed.");
            } else {
                arrayToDoList.remove(userInput - 1);
            }
        }
    }

    @Override
    public void execute() {

    }

    /*
    @Override
    void execute()
    {
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty, you cannot remove anything from it.");
            return;
        }
        System.out.println("Please add the number of the task to remove: ");
        Scanner input = new Scanner(System.in);
        removeInput = input.nextInt();
        if (removeInput > arrayToDoList.size() || removeInput <= 0) {
            System.out.println("Hulye vagy probald ujra!!");
            execute(removeInput);
        }else {
            arrayToDoList.remove(removeInput -1 );
        }
    }

    static void execute(int removeInput){
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty, you cannot remove anything from it.");
            return;
        }
        System.out.println("Please add the number of the task to remove: ");
        Scanner input = new Scanner(System.in);
        removeInput = input.nextInt();
        if (removeInput > arrayToDoList.size() || removeInput <= 0) {
            System.out.println("Hulye vagy probald ujra!!");
            execute(removeInput);
        }else {
            arrayToDoList.remove(removeInput -1 );
        }
    }
    */
}
