package tuesday;

import java.util.Objects;

public class Memory extends ElectricalDevice {
    private int size;
    private int  frequency;


    public Memory(double voltage, double maxCurrent, int size, int frequency) {
        super(voltage, maxCurrent);
        this.size = size;
        this.frequency = frequency;
    }

    public Memory(int size, int frequency) {
        this.size = size;
        this.frequency = frequency;
    }

    @Override
    public double maxOutput() {
        return 0;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", frequency=" + frequency + "voltage" + this.getVoltage() + " maxCurrent" + this.getMaxCurrent() +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memory memory = (Memory) o;
        return size == memory.size &&
                frequency == memory.frequency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, frequency);
    }
}
