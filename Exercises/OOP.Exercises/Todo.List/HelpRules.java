package todolisttopic;

public class HelpRules extends CommandsWithoutParameters{

    @Override
    public void execute() {
        System.out.println("This is our first ToDoList App\n" +
                "The following actions are available:\n\t" +
                "Type 'list' to check your tasks (shortcut 'l')\n\t" +
                "Type 'add' to add a new task (shortcut 'a')\n\t" +
                "Type 'remove' to remove a task (shortcut 'r')\n\t" +
                "Type 'complete' if the task is completed (shortcut 'c')\n\t" +
                "Type 'help' to read all actions again (shortcut 'h')\n" +
                "Type 'exit' to to quit (shortcut 'e')\n");
    }
}
