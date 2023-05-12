package Computer_Hardware;

public class ZEHInputDevice {
    private ZEHMemory memory;

    public ZEHInputDevice(ZEHMemory memory) {
        this.memory = memory;
    }

    public int read() {
        // 从外部读取数据
        return 0;
    }

    public int readMemory(int address) {
        // 从内存读取数据
        return memory.readMemory(address);
    }
}