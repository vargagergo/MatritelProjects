import java.util.ArrayList;
import java.util.List;

public class frigosession {

    public static void main(String[] args) {
        List<Integer> integ = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            integ.add(i);
        }

        for (int i = 0; i < integ.size(); i++){
            System.out.print("" + integ.get(i)+ "  ");
        }
//
//        for (){
//            if (i % 2 == 0 ){
//                integ.remove(i);
//            }
//        }


        for (int i = 0; i < integ.size(); i++){
            System.out.print("" + integ.get(i)+ "  ");
        }
    }
}
