public class day_1 {
    public static int splitAndSum(String text) {
        int result = 0;

        /**
         * return 을 사용하여, 필요없는 else를 지운다.
         * • 코드의 흐름을 더 단순화 하기 위해, Guard 절이 참이면 즉시 실행을 종료하는 코드로 리팩토링
         * • 이를 Replace Nested Conditional with Guard Clauses 라고 한다.
         */
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] values = text.split("-");
        for (String value : values) {
            result += Integer.parseInt(value);
        }
        return result;
    }
}
