package tuesday;

public class Laptop extends  Computer {

    private boolean isMonitorFoldable;

    public Laptop(double voltage, double maxCurrent, Processor processor, Memory memory, Storage storage, boolean isMonitorFoldable) {
        super(voltage, maxCurrent, processor, memory, storage);
        this.isMonitorFoldable = isMonitorFoldable;
    }

    @Override
    public double maxOutput() {
        return 0;
    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }
}
