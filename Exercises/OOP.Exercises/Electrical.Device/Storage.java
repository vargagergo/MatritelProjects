package tuesday;

public class Storage extends ElectricalDevice {

    private String type;
    private int sizeInGB;

    public Storage(double voltage, double maxCurrent, String type, int sizeInGB) {
        super(voltage, maxCurrent);
        this.type = type;
        this.sizeInGB = sizeInGB;
    }



    @Override
    public double maxOutput() {
        return 0;
    }
}
