package todolisttopic;

public class ToDoItem {
    static boolean isComplete;
    static String itemName;


    public static boolean isComplete() {
        return isComplete;
    }

    public static void setComplete(boolean complete) {
        isComplete = complete;
    }

    public static String getItemName() {
        return itemName;
    }

    public static void setItemName(String itemName) {
        ToDoItem.itemName = itemName;
    }
}
