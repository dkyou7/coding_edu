import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day_1_2Test {

    @Test
    void getResult1() {        //25+61=100
        //1 ~ 5자리수 덧셈 수식이 맞는지 확인하는 프로그램
        //띄어쓰기 없음
        String str = "25+61=86"; //PASS
        String result = day_1_2.getResult(str);
        assertEquals("PASS",result);
    }
    @Test
    void getResult2() {        //25+61=100
        //1 ~ 5자리수 덧셈 수식이 맞는지 확인하는 프로그램
        //띄어쓰기 없음
        String str = "12345+12345=24690"; //PASS
        String result = day_1_2.getResult(str);
        assertEquals("PASS",result);
    }
    @Test
    void getResult3() {        //25+61=100
        //1 ~ 5자리수 덧셈 수식이 맞는지 확인하는 프로그램
        //띄어쓰기 없음
        String str = "5++5=10"; //ERROR
        String result = day_1_2.getResult(str);
        assertEquals("ERROR",result);
    }
    @Test
    void getResult4() {        //25+61=100
        //1 ~ 5자리수 덧셈 수식이 맞는지 확인하는 프로그램
        //띄어쓰기 없음
        String str = "10000+1=10002"; //FAIL
        String result = day_1_2.getResult(str);
        assertEquals("FAIL",result);
    }
}