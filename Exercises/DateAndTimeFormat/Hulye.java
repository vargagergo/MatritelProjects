package DateAndTimeFormat;

import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

import java.time.LocalDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;

public class Hulye {


   public static Calendar cal = Calendar.getInstance();
   public static DateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



   public static void getFirstAndLastDayOfTheWeek(){
       LocalDate today = LocalDate.now();

       LocalDate monday = today.with(previousOrSame(MONDAY));
       LocalDate sunday = today.with(nextOrSame(SUNDAY));

       System.out.println("Today: " + today);
       System.out.println("Monday of the Week: " + monday);
       System.out.println("Sunday of the Week: " + sunday);
   }

    public static void main(String[] args) {

        Date now = new Date();



        System.out.println(dateFormat.format(now));
        System.out.println("Maximum year : " + cal.getActualMaximum(Calendar.YEAR));
        System.out.println("Maximum month : " + cal.getActualMaximum(Calendar.MONTH));
        System.out.println("Maximum week per year : " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Maximum week per month : " + cal.getActualMaximum(Calendar.WEEK_OF_MONTH));

        System.out.println("Minimum year : " + cal.getActualMinimum(Calendar.YEAR));
        System.out.println("Minimum month : " + cal.getActualMinimum(Calendar.MONTH));
        System.out.println("Minimum week per year : " + cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Minimum week per month : " + cal.getActualMinimum(Calendar.WEEK_OF_MONTH));


        TimeZone timezone = TimeZone.getTimeZone("EST");
        dateFormat.setTimeZone(timezone);

        System.out.println("The current time in New York is : " + dateFormat.format(cal.getTime()));

        getFirstAndLastDayOfTheWeek();

    }

}
