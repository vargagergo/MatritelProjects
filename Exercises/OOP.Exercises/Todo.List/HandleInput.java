package todolisttopic;

import java.util.Scanner;

import static todolisttopic.ToDoList.*;
import static todolisttopic.AddOneItem.*;
import static todolisttopic.ListItems.*;



public class HandleInput{

    String userInput;

    public void handleUserInput (String input){

        if (input.equals("add") || input.equals("a")){
            System.out.println("Please add a task: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            AddOneItem addItem = new AddOneItem();
            addItem.execute(userInput);

        }
        else if (input.equals("list") || input.equals("l")){
            ListItems listItems = new ListItems();
            listItems.execute();

        }
        else if (input.equals("remove") || input.equals("r")){

        }
        else if (input.equals("complete") || input.equals("c")){
            completeItem();
        }
        else if (input.equals("help") || input.equals("h")){
            helpRules();
        }
        else if (input.equals("exit") || input.equals("e")){
            exitProgram();
        }
        else {
            System.out.println("Its an illegal option. Please give another.");
            helpRules();
        }
    }

    public void askUserInput() {
        while (!userInput.equals("e") || !userInput.equals("exit")) {
            System.out.println("Please enter your command:");
            Scanner input = new Scanner(System.in);
            userInput = input.next();
            handleUserInput(userInput);
        }
    }
}
