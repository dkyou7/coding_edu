
public class Main {
    public static void main(String[] args) {
        //25+61=100
        //1 ~ 5자리수 덧셈 수식이 맞는지 확인하는 프로그램
        //띄어쓰기 없음
        String str = "25+61=86"; //PASS
        //String str = "12345+12345=24690"; //PASS
        //String str = "5++5=10"; //ERROR
        //String str = "10000+1=10002"; //FAIL
        SumMachine sm = new SumMachine();
        System.out.println(sm.getResult(str));
    }
}