package Computer_Software;

import Computer_Hardware.ZEHMemory;
import Computer_Hardware.ZEHBus;
public class ZEHInstructionExecutor {
    private int[] registers;
    private ZEHMemory memory;
    private ZEHBus bus;

    public ZEHInstructionExecutor(int[] registers, ZEHMemory memory, ZEHBus bus) {
        this.registers = registers;
        this.memory = memory;
        this.bus = bus;
    }

    public void execute(ZEHInstruction instruction) {
        int opcode = instruction.getOpcode();
        int operand = instruction.getOperand();
        switch (opcode) {
            case 0x01: // MOV Rn, immediate
                int n = operand >>> 4;
                int imm = operand & 0x0F;
                registers[n] = imm;
                break;
            case 0x02: // MOV Rn, [Rm]
                n = operand >>> 4;
                int m = operand & 0x0F;
                int addr = registers[m];
                registers[n] = memory.readMemory(addr);
                break;
            // ... 其他指令的实现
            default:
                throw new IllegalArgumentException("Invalid opcode: " + opcode);
        }
    }
}

