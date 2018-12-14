package tuesday;

public class DesktopComputer extends Computer {

    Monitor monitor;

    public DesktopComputer(double voltage, double maxCurrent, Processor processor, Memory memory, Storage storage, Monitor monitor) {
        super(voltage, maxCurrent, processor, memory, storage);
        this.monitor = monitor;
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
