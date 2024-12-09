package DAY1.ALU;

import DAY1.ALU.Output;

public class ALU {
    public static final int STATUS_SUCCESS = 0;
    public static final int RESULT_INVALID = 65535;
    public static final int STATUS_INVALID_OPCODE = 3;
    public static final int STATUS_INVALID_OPER1 = 1;
    public static final int STATUS_INVALID_OPER2 = 2;
    private int operand1 = -1;
    private int operand2 = -1;
    private String OPCODE = "";
    public void enableSignal(Output output) {
        if (!isPreconditionOK(output)) return;
        output.setOutput(makeOutputWithCalculation(), STATUS_SUCCESS);
    }
    private int makeOutputWithCalculation() {
        int result = 0;
        if (OPCODE.equals("ADD")) result = operand1 + operand2;
        if (OPCODE.equals("MUL")) result = operand1 * operand2;
        if (OPCODE.equals("SUB")) result = operand1 - operand2;
        return result;
    }
    private boolean isPreconditionOK(Output output) {
        if (isInvalidOPCODE()) {
            output.setOutput(RESULT_INVALID, STATUS_INVALID_OPCODE);
            return false;
        }
        if (isInvalidOperand1()) {
            output.setOutput(RESULT_INVALID, STATUS_INVALID_OPER1);
            return false;
        }
        if (isInvalidOperand2()) {
            output.setOutput(RESULT_INVALID, STATUS_INVALID_OPER2);
            return false;
        }
        return true;
    }
    private boolean isInvalidOperand2() {
        return operand2 == -1;
    }
    private boolean isInvalidOperand1() {
        return operand1 == -1;
    }
    private boolean isInvalidOPCODE() {
        return !(OPCODE.equals("ADD") || OPCODE.equals("MUL") || OPCODE.equals("SUB"));
    }
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    public void setOPCODE(String OPCODE) {
        this.OPCODE = OPCODE;
    }
}