package tuesdayCDExercise;

import java.util.ArrayList;
import java.util.List;

public class CDTrays  {

    private List<CD> listOfCds = new ArrayList<>();
    private String label;

    public CDTrays(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }


    public List<CD> getListOfCds() {

        return listOfCds;
    }




    public void printListElement(){
        for (int i = 0; i< listOfCds.size(); i++){
            System.out.println(listOfCds.get(i));
        }
    }


    public void addCD(CD cd){
        listOfCds.add(cd);

    }

    @Override
    public String toString() {
        return "CDTrays{" +
                "label='" + label + '\'' +
                '}';
    }
}
