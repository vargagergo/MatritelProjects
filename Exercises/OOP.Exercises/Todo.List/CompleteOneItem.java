package todolisttopic;

import java.util.Scanner;

public class CompleteOneItem extends CommandsWithParameters{

    @Override
    public void execute() {

    }

    @Override
    public void execute(String s) {
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty, you cannot complete anything.");
            return;
        }
        System.out.println("Please add the number of the task which is completed: ");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        if (!isInteger(s)){
            System.out.println("This input is not an integer! No change.");
        } else {
            int userInput;
            userInput = Integer.parseInt(s);
            if (userInput > arrayToDoList.size() || userInput < 0) {
                System.out.println("There is no such number of element. Nothing is changed.");
            } else {
                arrayToDoList.get(userInput - 1).setComplete(true);
                System.out.println(ANSI_GREEN + "\u2713"+ (userInput) + " " + arrayToDoList.get(userInput -1).getItemName() + ANSI_RESET);
            }
        }
    }

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
}
