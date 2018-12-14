package todolisttopic;

public class ExitGame extends CommandsWithoutParameters{

    @Override
    public void execute() {
        System.out.println("You closed the ToDo App! Bye!");
        System.exit(0);
    }
}
