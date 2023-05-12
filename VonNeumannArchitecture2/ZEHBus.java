package VonNeumannArchitecture;

//总线，传输数据，从InputDevice中读数据，向OutputDevice中传数据
public class ZEHBus {
    private ZEHInputDevice inputDevice;
    private ZEHOutputDevice outputDevice;
    private ZEHMemory memory;

    public ZEHBus(ZEHInputDevice inputDevice, ZEHOutputDevice outputDevice, ZEHMemory memory) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
        this.memory = memory;
    }

    public int readInput() {
        return inputDevice.read();
    }

    public void writeOutput(int data) {
        outputDevice.write(data);
    }

    public int readMemory(int address) {
        return memory.readMemory(address);
    }

    public void writeMemory(int address, int data) {
        memory.writeMemory(address, data);
    }
}
