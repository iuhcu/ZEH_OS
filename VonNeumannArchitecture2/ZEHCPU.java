package VonNeumannArchitecture;

public class ZEHCPU {
    private int[] registers;
    private ZEHMemory memory;
    private ZEHBus bus;

    private int PC; // 程序计数器

    public ZEHCPU(ZEHMemory memory, ZEHBus bus) {
        this.registers = new int[16];
        this.memory = memory;
        this.bus = bus;
        this.PC = 0;
    }

    public void fetch() {
        // 取指令，PC值＋1
        registers[PC] = bus.readMemory(PC);
        PC++;
    }

    public void decode() {
        // 解码指令
    }

    public void execute() {
        // 执行指令
    }
}