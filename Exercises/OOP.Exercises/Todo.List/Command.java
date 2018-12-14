package todolisttopic;

import java.util.ArrayList;

public interface Command {

    ToDoItem toDoItem = new ToDoItem();
    ArrayList<ToDoItem> arrayToDoList = new ArrayList<>();

    String ANSI_RESET = "\u001B[0m";
    String ANSI_GREEN = "\u001B[32m";

    void execute();



}
