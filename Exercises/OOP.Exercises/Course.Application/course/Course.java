package wednesday.course;

import wednesday.people.Mentor;
import wednesday.people.Student;

import java.time.LocalDate;
import java.util.List;

public abstract class Course {


    private LocalDate startOfCourse = LocalDate.of(2018,9,10);
    private LocalDate endOfCourse = LocalDate.of(2019,2,21);
    private List<Student> students;
    private List<Mentor> mentors;


    abstract void visitSponsors();
    abstract void learnNewTechnology();


    public boolean isOnGoing(){
        LocalDate timeNow = LocalDate.now();
        if(timeNow.isAfter(startOfCourse) && timeNow.isBefore(endOfCourse)){
            return true;
        }
        return false;

    }


}
