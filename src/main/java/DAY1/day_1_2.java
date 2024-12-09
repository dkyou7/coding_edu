package DAY1;

public class day_1_2 {
    static String getResult(String str) {
        count result = getCount(str);
        if (result.flag1 == 1) return "ERROR";
        if (pandan1(str, result)) {
            result.flag2 = pandan1(str,result) ? 1 : 0;
            String num1 = str.substring(0, result.index1);
            String num2 = str.substring(result.index1 + 1, result.index2);
            String num3 = str.substring(result.index2 + 1);
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int n3 = Integer.parseInt(num3);
            if (n1 + n2 == n3) {
                //System.out.println("PASS");
                return "PASS";
            } else {
                //System.out.println("FAIL");
                return "FAIL";
            }
        }
        if (result.flag2 == 0) {
            //System.out.println("ERROR");
            return "ERROR";
        }
        return null;
    }

    private static boolean pandan1(String str, count result) {
        return result.plusCount == 1 && result.equalCount == 1
                && result.index1 < result.index2 - 1 && result.index1 >= 1
                && result.index2 >= 3 && result.index2 < str.length() - 1;
    }

    private static count getCount(String str) {
        int plusCount = 0, point1 = 0, equalCount = 0, point2 = 0, flag1 = 0, flag2 = 0;

        //+와 = 개수 확인
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                plusCount++;
                point1 = i;
            } else if (str.charAt(i) == '=') {
                equalCount++;
                point2 = i;
            } else if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                flag1 = 1;
                break;
            }
        }
        count result = new count(flag1, plusCount, equalCount, point1, point2);
        return result;
    }

    private static class count {
        int flag1;
        int flag2;
        int plusCount;
        int equalCount;
        int index1;
        int index2;

        public count(int flag1, int plusCount, int equalCount, int index1, int index2) {
            this.flag1 = flag1;
            this.plusCount = plusCount;
            this.equalCount = equalCount;
            this.index1 = index1;
            this.index2 = index2;
        }
    }
}
