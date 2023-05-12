package Computer_Hardware;

public class ZEHBus {
    private ZEHCPU cpu;
    private ZEHMemory memory;
    private ZEHSecondaryStorage secondaryStorage;
    private ZEHInputDevice inputDevice;
    private ZEHOutputDevice outputDevice;

    public ZEHBus(ZEHCPU cpu, ZEHMemory memory, ZEHSecondaryStorage secondaryStorage,
                  ZEHInputDevice inputDevice, ZEHOutputDevice outputDevice) {
        this.cpu = cpu;
        this.memory = memory;
        this.secondaryStorage = secondaryStorage;
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void connect() {
        // 连接各个硬件设备
    }

    public int readMemory(int pc) {
        return 1;
    }
}
