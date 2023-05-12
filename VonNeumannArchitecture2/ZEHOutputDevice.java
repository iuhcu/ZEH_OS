package VonNeumannArchitecture;

public class ZEHOutputDevice {
    private ZEHMemory memory;

    public ZEHOutputDevice(ZEHMemory memory) {
        this.memory = memory;
    }

    public void write(int data) {
        // 输出数据到外部
    }

    public void writeMemory(int address, int data) {
        // 将数据写入内存
        memory.writeMemory(address, data);
    }
}