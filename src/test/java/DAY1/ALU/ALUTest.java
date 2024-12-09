package DAY1.ALU;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ALUTest {
    @Test
    void enableSignal() {
        ALU alu = new ALU();
        alu.setOperand1(10);
        alu.setOperand2(20);
        alu.setOPCODE("ADD");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(30, ret.getResult());
        assertEquals(0, ret.getStatus());
    }
    @Test
    void enableSignal2() {
        ALU alu = new ALU();
        alu.setOperand1(10);
        alu.setOperand2(20);
        alu.setOPCODE("MUL");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(200, ret.getResult());
        assertEquals(0, ret.getStatus());
    }
    @Test
    void enableSignal3() {
        ALU alu = new ALU();
        alu.setOperand1(10);
        alu.setOperand2(20);
        alu.setOPCODE("SUB");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(-10, ret.getResult());
        assertEquals(0, ret.getStatus());
    }
    @Test
    void enableSignal4() {
        ALU alu = new ALU();
        alu.setOperand1(-1);
        alu.setOperand2(20);
        alu.setOPCODE("SUB");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(1, ret.getStatus());
    }
    @Test
    void enableSignal5() {
        ALU alu = new ALU();
        alu.setOperand1(50);
        alu.setOperand2(-1);
        alu.setOPCODE("SUB");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(2, ret.getStatus());
    }
    @Test
    void enableSignal6() {
        ALU alu = new ALU();
        alu.setOperand1(-1);
        alu.setOperand2(20);
        alu.setOPCODE("ADD");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(1, ret.getStatus());
    }
    @Test
    void enableSignal7() {
        ALU alu = new ALU();
        alu.setOperand1(50);
        alu.setOperand2(-1);
        alu.setOPCODE("ADD");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(2, ret.getStatus());
    }
    @Test
    void enableSignal8() {
        ALU alu = new ALU();
        alu.setOperand1(-1);
        alu.setOperand2(20);
        alu.setOPCODE("MUL");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(1, ret.getStatus());
    }
    @Test
    void enableSignal9() {
        ALU alu = new ALU();
        alu.setOperand1(50);
        alu.setOperand2(-1);
        alu.setOPCODE("MUL");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(2, ret.getStatus());
    }
    @Test
    void enableSignal10() {
        ALU alu = new ALU();
        alu.setOperand1(50);
        alu.setOperand2(33);
        alu.setOPCODE("RMUL");
        Output ret = new Output();
        alu.enableSignal(ret);
        assertEquals(65535, ret.getResult());
        assertEquals(3, ret.getStatus());
    }
}