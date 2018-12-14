package tuesday;

public class Processor extends ElectricalDevice {

    private int core;
    private int frequency;


    public Processor(double voltage, double maxCurrent, int core, int frequency) {
        super(voltage, maxCurrent);
        this.core = core;
        this.frequency = frequency;
    }

    public Processor(int core, int frequency) {
        this.core = core;
        this.frequency = frequency;
    }

    @Override
    public double maxOutput() {
        return 0;
    }
}
