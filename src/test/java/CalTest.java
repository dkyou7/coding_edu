import DAY1.Cal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getSum() {
        Cal cal  = new Cal();
        assertEquals(3,cal.getSum(1,2));
    }

    @Test
    void getSum2() {
        Cal cal  = new Cal();
        assertEquals(6,cal.getSum(2,4));
    }
    @Test
    void getSum3() {
        Cal cal  = new Cal();
        assertNotEquals(6,cal.getSum(2,3),"정답은 5입니다.");
    }
    @Test
    void getSum4() {
        Cal cal  = new Cal();
        assertEquals(3,cal.getSum(1,2));
    }
    @Test
    void getSum5() {
        Cal cal  = new Cal();
        assertEquals(3,cal.getSum(1,2));
    }
    @Test
    void getSum6() {
        Cal cal  = new Cal();
        assertEquals(3,cal.getSum(1,2));
    }

    @BeforeEach
    void setUp() {
        System.out.println("여기에 초기화 코드가 들어갑니다.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("여기에 마무리 코드가 들어갑니다.");
    }
}