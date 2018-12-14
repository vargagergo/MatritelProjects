package todolisttopic;

import java.util.ArrayList;
import java.util.Scanner;

import static todolisttopic.HandleInput.*;

public class ToDoList {

    static ArrayList<ToDoItem> arrayToDoList = new ArrayList<>();
    static String userInput = "Startinput";


/*
    public static void removeItem(){
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty, you cannot remove anything from it.");
            return;
        }
            System.out.println("Please add the number of the task to remove: ");
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            if (userInput > arrayToDoList.size() || userInput <= 0) {
                System.out.println("Hulye vagy probald ujra!!");
                removeItem();
            }else {
                arrayToDoList.remove(userInput -1 );
            }



*/

/*
    public static void completeItem(){
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty, you cannot complete anything.");
            return;
        }
        System.out.println("Please add the number of the task which is completed: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        arrayToDoList.get(userInput - 1).setComplete(true);
        System.out.println(ANSI_GREEN + "\u2713"+ (userInput) + " " + arrayToDoList.get(userInput -1).getItemName() + ANSI_RESET);
    }
*/

    public static void helpRules (){
        System.out.println("This is our first ToDoList App\n" +
                "The following actions are available:\n\t" +
                "Type 'list' to check your tasks (shortcut 'l')\n\t" +
                "Type 'add' to add a new task (shortcut 'a')\n\t" +
                "Type 'remove' to remove a task (shortcut 'r')\n\t" +
                "Type 'complete' if the task is completed (shortcut 'c')\n\t" +
                "Type 'help' to read all actions again (shortcut 'h')\n" +
                "Type 'exit' to to quit (shortcut 'e')\n");
    }
    /*
    public static void askUserInput(){
        while (!userInput.equals("e") || !userInput.equals("exit")){
            System.out.println("Please enter your command:");
            Scanner input = new Scanner(System.in);
            userInput = input.next();
            handleUserInput(userInput);
        }
    }
    */
}

