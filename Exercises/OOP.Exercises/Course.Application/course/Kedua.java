package wednesday.course;

public class Kedua extends Course {

    @Override
    void visitSponsors() {
        System.out.println("Going to Loxon");
    }

    @Override
    void learnNewTechnology() {
        System.out.println("Learn TDD with Zsombor");
    }
}
