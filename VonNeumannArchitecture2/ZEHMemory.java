package VonNeumannArchitecture;

public class ZEHMemory {
    private int[] memory;

    public ZEHMemory(int size) {
        memory = new int[size];
    }

    public int readMemory(int address) {
        return memory[address];
    }

    public void writeMemory(int address, int data) {
        memory[address] = data;
    }
}