package Computer_Hardware;

public class ZEHSecondaryStorage {
    private int[] storage;

    public ZEHSecondaryStorage(int size) {
        storage = new int[size];
    }

    public int readStorage(int address) {
        return storage[address];
    }

    public void writeStorage(int address, int data) {
        storage[address] = data;
    }
}
