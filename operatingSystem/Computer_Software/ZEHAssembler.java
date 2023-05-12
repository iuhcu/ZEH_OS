package Computer_Software;

import java.util.HashMap;

public class ZEHAssembler {
    private static final HashMap<String, Integer> opcodes = new HashMap<>();

    static {
        opcodes.put("ADD", 0x00);
        opcodes.put("SUB", 0x01);
        opcodes.put("AND", 0x02);
        opcodes.put("OR", 0x03);
        opcodes.put("NOT", 0x04);
        opcodes.put("LOAD", 0x10);
        opcodes.put("STORE", 0x11);
        opcodes.put("MOVE", 0x12);
        opcodes.put("JUMP", 0x20);
        opcodes.put("JZ", 0x21);
        opcodes.put("JNZ", 0x22);
        opcodes.put("HALT", 0xFF);
    }

    public static ZEHProgram assemble(String code) {
        String[] lines = code.split("\n");
        int[] instructions = new int[lines.length];

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();

            if (line.isEmpty() || line.startsWith(";")) {
                // 忽略注释和空行
                continue;
            }

            String[] parts = line.split("\\s+");
            String opcode = parts[0];

            if (!opcodes.containsKey(opcode)) {
                throw new IllegalArgumentException("Invalid opcode: " + opcode);
            }

            int codeValue = opcodes.get(opcode);

            if (parts.length > 1) {
                // 处理操作数
                String operand = parts[1];

                if (operand.startsWith("R")) {
                    // 寄存器
                    int register = Integer.parseInt(operand.substring(1));

                    if (register < 0 || register >= 16) {
                        throw new IllegalArgumentException("Invalid register: " + register);
                    }

                    codeValue |= register << 4;
                } else {
                    // 内存地址
                    int address = Integer.parseInt(operand);

                    if (address < 0 || address >= 256) {
                        throw new IllegalArgumentException("Invalid memory address: " + address);
                    }

                    codeValue |= address;
                }
            }

            instructions[i] = codeValue;
        }

        return new ZEHProgram();
    }
}
