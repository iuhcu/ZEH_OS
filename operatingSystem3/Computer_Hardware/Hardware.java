package Computer_Hardware;

public class Hardware {
    private ZEHBus bus;
    private ZEHMemory mainMemory;
    private ZEHMemory auxiliaryMemory;
    private ZEHInputDevice inputDevice;
    private ZEHOutputDevice outputDevice;
    private ZEHCPU cpu;


    public void run() {
        // 系统启动
        cpu.fetch();
        cpu.decode();
        cpu.execute();
    }

    public static void main(String[] args) {

    }
}