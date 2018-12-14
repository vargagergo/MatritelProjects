package garden;

public abstract class Plants {

    double waterLevel;
    String name;

    abstract double water(double water);

    abstract String printWaterState();

    abstract boolean needWater();





    public void setName(String name) {
        this.name = name;
    }


}
