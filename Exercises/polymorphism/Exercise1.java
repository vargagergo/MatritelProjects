
package polymorphism;

import java.lang.*;

public class Exercise1 {

    public static double sumoftwo(double firstNum,double secondNum){
        double z = firstNum + secondNum;
        return z;
    }


    public static int sumoftwo(int num1, int num2) {
        return num1 + num2;

    }

    public static String sumoftwo(String a,String b){
        return a + b;
    }

    public static void main(String[] args) {


        System.out.println(sumoftwo("asd","asddds"));
        System.out.println(sumoftwo(10.2,25.3));
        System.out.println(sumoftwo(14,45));




    }
}

