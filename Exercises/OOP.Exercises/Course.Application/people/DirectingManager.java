package wednesday.people;

import java.util.List;

public class DirectingManager extends Employee implements Manager {
    @Override
    public void gatherMeeting(List<Employee> employees) {
        System.out.println("Talking about RULES :D");
        //prints out: Talking about RULES :D
    }
}
