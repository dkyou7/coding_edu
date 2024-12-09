public class day_1 {
    public static int splitAndSum(String text) {
        if (isEmpty(text)) return 0;
        return getSum(toInts(textSplit(text)));
    }
    /**
     * 더 이해하기 쉽게 변경
     */
    private static String[] textSplit(String text) {
        return text.split("-");
    }
    /**
     * 더 이해하기 쉽게 변경
     */
    private static boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }
    /**
     * 타입을 변경하는 메서드를 구현
     */
    private static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }
    /**
     * 하나의 역할을 하는 메소드로 만든다.
     * getSum 은 하나씩 수로 바꾸어 sum을 구하는 메서드
     * → 수로 변경하는 메서드 / sum을 구하는 메서드로 분리
     */
    private static int getSum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}
