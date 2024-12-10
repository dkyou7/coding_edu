package DAY2.wheel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WheelTest {
    @Test
    void getSum1() {
        ArrayList<StringBuilder> strs = new ArrayList<>();
        String userdata = "ERABCDFGHIJKLMNOPQSTUVWXYZ";
        strs.add(new StringBuilder("BUILDLEV"));
        strs.add(new StringBuilder("EATREALROBOT"));
        int sum = Wheel.getSum(strs, userdata);
        assertEquals(6500, sum);
    }
    @Test
    void getSum2() {
        ArrayList<StringBuilder> strs = new ArrayList<>();
        String userdata = "XASBKQDJHMNPTLVUCGEWFORIYZ";
        strs.add(new StringBuilder("ABS"));
        strs.add(new StringBuilder("ABS"));
        strs.add(new StringBuilder("AAAAAKBA"));
        int sum = Wheel.getSum(strs, userdata);
        assertEquals(9500, sum);
    }
    @Test
    void getSum3() {
        ArrayList<StringBuilder> strs = new ArrayList<>();
        String userdata = "QDBKTLVUCGEWFJHMNPXASORIYZ";
        strs.add(new StringBuilder("VIRN"));
        strs.add(new StringBuilder("AIIA"));
        strs.add(new StringBuilder("IIIIQAAB"));
        int sum = Wheel.getSum(strs, userdata);
        assertEquals(4300, sum);
    }
}