package wednesday.people;

import wednesday.course.Exam;

import java.util.List;

public class SeniorMentor extends Employee implements Mentor {
    @Override
    public Exam setupExam() {
        System.out.println("Senior Manager prepared difficult exam");
        Exam myExam = new Exam();
        myExam.setPassLimit(75);

        //prints out: Senior Manager prepared difficult exam, creates new Exam with a passLimit of 75
        return null;
    }

    @Override
    public void teach(List<Student> students) {

        for (Student student : students){
            student.learn(2);
        }
        //increments preparationScale of every student by 2

    }
}
