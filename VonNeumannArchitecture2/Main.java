package VonNeumannArchitecture;

public class Main {
    public static void main(String[] args) {
        ZEHMemory memory = new ZEHMemory(1024);
        ZEHBus bus = new ZEHBus(new ZEHInputDevice(memory), new ZEHOutputDevice(memory), memory);
        ZEHCPU cpu = new ZEHCPU(memory, bus);
        // 执行指令
        cpu.fetch();
        cpu.decode();
        cpu.execute();
    }
}