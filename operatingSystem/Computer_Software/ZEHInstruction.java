package Computer_Software;

public class ZEHInstruction {
    private int opcode;
    private int operand;

    public ZEHInstruction(int opcode, int operand) {
        this.opcode = opcode;
        this.operand = operand;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getOperand() {
        return operand;
    }
}
