package Computer_Software;

public class ZEHProgramCounter {
    private int PC;

    public ZEHProgramCounter() {
        this.PC = 0;
    }

    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public void increment() {
        PC++;
    }
}
