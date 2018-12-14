package wednesday.people;

import wednesday.course.Exam;

import java.util.List;

public class CourseManager extends Employee implements Mentor, Manager {


    @Override
    public void teach(List<Student> students) {

        for (Student student : students){
            student.learn(1);
        }


        //increments preparationScale of every student by 1
    }

    @Override
    public void gatherMeeting(List<Employee> employees) {

        System.out.println("Talking about very very important course related stuff ;)");

        //prints out: Talking about very very important course related stuff ;)

    }

    @Override
    public Exam setupExam() {
        System.out.println(" Course Manager prepared easy exam!");
        Exam myExam = new Exam();
        myExam.setPassLimit(65);
        //prints out: Course Manager prepared easy exam, creates new Exam with a passLimit of 65
        return null;
    }


}
