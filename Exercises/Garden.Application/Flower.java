package garden;

public class Flower extends Plants{

    public Flower (String name){
        super.name = name;
    }


    @Override
    double water(double water) {
        double absorbedWater = water * 0.75;
        return absorbedWater;
        }


    @Override
    String printWaterState() {
        String printWaterState;
        if (needWater() == true){
            printWaterState = " needs water.";
        }else{
            printWaterState = " doesn't need water.";
        }
        return printWaterState;

    }

    @Override
    boolean needWater() {
        boolean needWater = false;
        if (waterLevel < 5){
            needWater = true;
        }
        return needWater;
    }






}
