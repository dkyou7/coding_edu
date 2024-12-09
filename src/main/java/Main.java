public class Main {

    public static int splitAndSum(String text) {
        int result = 0;

        if (text == null || text.isEmpty()) {
            result = 0;
        }
        else {
            String[] values = text.split("-");
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int ret = splitAndSum("11-22-33");

        System.out.println(ret);

    }

}