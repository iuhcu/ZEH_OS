package Computer_Software;

import java.util.List;

public class ZEHProgram {
    private List<Integer> instructions;

    public ZEHProgram() {
        this.instructions = instructions;
    }

    public int getInstruction(int address) {
        return instructions.get(address);
    }

    public int size() {
        return instructions.size();
    }
}
