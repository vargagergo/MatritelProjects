package todolisttopic;

public class ListItems extends CommandsWithoutParameters{


    @Override
    public void execute() {
        if (arrayToDoList.size() == 0){
            System.out.println("Your list is empty. Try another command!");
            return;
        }
        for (int i = 0; i < arrayToDoList.size(); i++){
            if (arrayToDoList.get(i).isComplete()) {
                System.out.println(ANSI_GREEN + "\u2713"+ (i+1) + " " + arrayToDoList.get(i).getItemName() + ANSI_RESET);
            }
            else {
                System.out.println((i+1) + " " + arrayToDoList.get(i).getItemName());
            }
        }
    }
}
