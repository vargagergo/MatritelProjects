package toDoList;

public class ToDoItem {

    String name;
    boolean complete = false;

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToDoItem(String name){
        this.name = name;

    }
    @Override
    public String toString() {
        if (complete){
            return ("[X] " + this.name);
        }else {
            return ("[ ] " + this.name);
        }

    }
}
