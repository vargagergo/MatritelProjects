package todolisttopic;

import java.util.Scanner;

public class AddOneItem extends CommandsWithParameters{

    public void execute(String s) {
/*
        System.out.println("Please add a task: ");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
*/
        ToDoItem newItem = new ToDoItem();
        newItem.setItemName(s);
        arrayToDoList.add(newItem);  // when list the newItem object which is going to be the element of the toDoList, we have tu use the getter of the newItem
    }

    @Override
    public void execute() {
    }
}
