package wednesday.people;

import wednesday.course.Exam;

import java.util.List;

public class Student extends Person {

    private int preparationScale;
    private int miseedDays;
    private List<Exam> tankenExams;



    public void skip(int days){
       miseedDays += days;
       preparationScale -= days * 2;

        //adds given number in parameter to missedDays,
        // subtracts the multiplication of days and 2 from preparationScale
    }

    public boolean canContinueCourse(){

       for(Exam ex : tankenExams){
           if(!ex.hasPassed())
               return false;
       }
           if (miseedDays > 3) {
               return false;
           }

       // student cannot continue course
        // if missed days is bigger than 3 OR has at least one failed exam
        //change return type
       return true;
    }

    public void learn(int hours){
       preparationScale += hours;
    }

    public void writeExam(Exam exam){

       if(preparationScale >= 20){
           exam.setResult(100);
       }else {
           exam.setResult(preparationScale * 5);
       }

        preparationScale = 0;

       //returns 100 (percent) if the hours spent learning is 20 of bigger;
        // if the hours are less then 20, then it returns the multiplication
        // of the preparationScale and 5
    }
    //do not forget to reset the preparationScale to zero -->
    // --> hours spent learning are only taken into consideration for one exam
}
