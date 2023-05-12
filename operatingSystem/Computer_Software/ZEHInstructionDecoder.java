package Computer_Software;

public class ZEHInstructionDecoder {
    public static ZEHInstruction decode(int instruction) {
        int opcode = instruction >>> 24;
        int operand = instruction & 0x00FFFFFF;
        return new ZEHInstruction(opcode, operand);
    }
}
