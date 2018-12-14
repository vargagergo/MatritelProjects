package tuesday;

public abstract class  Computer extends ElectricalDevice implements SwitchOnOff {
    public Processor processor;
    public Memory memory;
    public Storage storage;

    public Computer(double voltage, double maxCurrent, Processor processor, Memory memory, Storage storage) {
        super(voltage, maxCurrent);
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public Computer() {
    }


    //    @Override
//    public String toString() {
//        return "Computer{" +
//                "processor=" + processor +
//                ", memory=" + memory +
//                ", storage=" + storage +
//                ", voltage=" + voltage +
//                ", maxCurrent=" + maxCurrent +
//                '}';
//    }
}
