package Test;

import Computer_Hardware.ZEHCPU;
import Computer_Hardware.ZEHInputDevice;
import Computer_Hardware.ZEHMemory;
import Computer_Hardware.ZEHOutputDevice;

public class Main {
    public static void main(String[] args) {
        //main方法 高度抽象 机器启动 os启动 调入测试序列
        ZEHMemory memory = new ZEHMemory(1024);
        ZEHBus bus = new ZEHBus(new ZEHInputDevice(memory), new ZEHOutputDevice(memory), memory);
        ZEHCPU cpu = new ZEHCPU(memory, bus);
        // 执行指令
        cpu.fetch();
        cpu.decode();
        cpu.execute();
    }
}