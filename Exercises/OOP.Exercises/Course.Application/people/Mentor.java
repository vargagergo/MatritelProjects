package wednesday.people;

import wednesday.course.Exam;

import java.util.List;

public interface Mentor {

    Exam setupExam();
    void teach(List<Student> students);

}
