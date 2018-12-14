package tuesday;

public abstract class ElectricalDevice {

    private double voltage;
    private double maxCurrent;



    public ElectricalDevice() {
    }

    public ElectricalDevice(double voltage, double maxCurrent) {
        this.voltage = voltage;
        this.maxCurrent = maxCurrent;
    }
    //  output = voltage * current
    public abstract double maxOutput();

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getMaxCurrent() {
        return maxCurrent;
    }

    public void setMaxCurrent(double maxCurrent) {
        this.maxCurrent = maxCurrent;
    }

}
