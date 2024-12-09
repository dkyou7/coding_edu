package DAY1.ALU;

public class Output {
    private int status = -1;
    private int result = 65535;
    public static final int STATUS_SUCCESS = 0;
    public static final int RESULT_INVALID = 65535;
    public static final int STATUS_INVALID_OPCODE = 3;
    public static final int STATUS_INVALID_OPER1 = 1;
    public static final int STATUS_INVALID_OPER2 = 2;
    //result 65535 : 결과 없음
    public void setOutput(int result, int status) {
        this.result = result;
        this.status = status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public int getStatus() {
        return status;
    }
    public int getResult() {
        return result;
    }
}