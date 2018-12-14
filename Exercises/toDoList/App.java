package toDoList;

import java.util.*;

public class App {

    public static List<ToDoItem> toDoList = new ArrayList();
    public static boolean run = true;

    public static void main(String[] args) {

        while (run){
            handleUserInput();
        }
    }

    public static void commands(){
        System.out.println("Select and option!"+
                "\n\nType 'list'to list all the tasks."+
                "\n\tShorthand for list: 'l'"+
                "\n\nType 'add'to list all the tasks."+
                "\n\tShorthand for list: 'a'"+
                "\n\nType 'remove'to list all the tasks."+
                "\n\tShorthand for list: 'r'"+
                "\n\nType 'complete'to list all the tasks."+
                "\n\tShorthand for list: 'c'"+
                "\n\nType 'help'to list all the tasks."+
                "\n\tShorthand for list: 'h'"+
                "\n\nType 'exit'to list all the tasks."+
                "\n\tShorthand for list: 'e'");

    }
    public static void handleUserInput(){
        System.out.print("Please insert a command: ");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();

        if (input.equals("list") || input.equals("l")){
            listAllElements();
        }else if (input.equals("add") || input.equals("a")){
            addItemToDoList();
        }else if (input.equals("remove") || input.equals("r")){
            removeItemToDoList();
        }else if (input.equals("complete") || input.equals("c")){
            complete();
        }else if (input.equals("help") || input.equals("h")){
            commands();
        }else if (input.equals("exit") || input.equals("e")){
            run = false;
        }else{
            System.out.println("Please input a valid command!!");
            handleUserInput();
        }
    }
    public static void addItemToDoList(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();
        ToDoItem newitem = new ToDoItem(input);
        toDoList.add(newitem);
    }
    public static void removeItemToDoList(){
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        toDoList.remove(input);
    }

    public static void listAllElements(){

        for (int i = 0; i < toDoList.size(); i++) {
           System.out.println(toDoList.get(i).toString());
       }
     }


     public static void complete(){
         Scanner userInput = new Scanner(System.in);
         int input = userInput.nextInt();
         toDoList.get(input).setComplete(true);
     }

}


