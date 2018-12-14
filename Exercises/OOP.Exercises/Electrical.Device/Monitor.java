package tuesday;

public class Monitor extends ElectricalDevice {

    private int sizeInInch;
    private String   type;

    public Monitor(double voltage, double maxCurrent, int sizeInInch, String type) {
        super(voltage, maxCurrent);
        this.sizeInInch = sizeInInch;
        this.type = type;
    }

    @Override
    public double maxOutput() {
        return 0;
    }
}
