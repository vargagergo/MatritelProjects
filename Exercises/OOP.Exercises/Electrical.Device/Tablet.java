package tuesday;

public class Tablet extends Computer {

    private int size;

    public Tablet(double voltage, double maxCurrent, Processor processor, Memory memory, Storage storage, int size) {
        super(voltage, maxCurrent, processor, memory, storage);
        this.size = size;
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
