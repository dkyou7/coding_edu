package DAY1.ALU;

public class ALU {

    private int operand1 = -1;
    private int operand2 = -1;
    private String OPCODE = "";

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public void setOPCODE(String OPCODE) {
        this.OPCODE = OPCODE;
    }

    public void enableSignal(Result r) {
        switch (OPCODE) {
            case "ADD":
                if (operand1 == -1) r.setResultAndStatus(65535, 1);
                if (operand2 == -1) r.setResultAndStatus(65535, 2);
                if (operand1 != -1 && operand2 != -1) {
                    r.setResultAndStatus(operand1 + operand2, 0);
                }
                return;
            case "MUL":
                if (operand1 == -1) r.setResultAndStatus(65535, 1);
                if (operand2 == -1) r.setResultAndStatus(65535, 2);
                if (operand1 != -1 && operand2 != -1) {
                    r.setResultAndStatus(operand1 * operand2, 0);
                }
                return;
            case "SUB":
                if (operand1 == -1) r.setResultAndStatus(65535, 1);
                if (operand2 == -1) r.setResultAndStatus(65535, 2);
                if (operand1 != -1 && operand2 != -1) {
                    r.setResultAndStatus(operand1 - operand2, 0);
                }
                return;
        }
        r.setResultAndStatus(65535,3);
    }
}