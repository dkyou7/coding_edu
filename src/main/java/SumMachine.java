class SumMachine {
    public String getResult(String str) {
        if (isError(str)) return "ERROR";
        if (isPASS(str)) return "PASS";
        return "FAIL";
    }
    private static boolean isPASS(String str) {
        int p1 = str.indexOf('+');
        int p2 = str.indexOf('=');
        String num1 = str.substring(0, p1);
        String num2 = str.substring(p1 + 1, p2);
        String num3 = str.substring(p2 + 1);
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        if (n1 + n2 == n3) return true;
        return false;
    }
    public boolean isError(String str) {
        if (isValidOperatorCount(str) == false) return true;
        if (isValidOperatorPosition(str) == false) return true;
        if (isValidChar(str) == false) return true;
        return false;
    }
    private boolean isValidOperatorCount(String str) {
        int cnt1 = getCharCount(str, '+');
        int cnt2 = getCharCount(str, '=');
        if (cnt1 != 1) return false;
        if (cnt2 != 1) return false;
        return true;
    }
    private int getCharCount(String str, char target) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                result++;
            }
        }
        return result;
    }
    private boolean isValidOperatorPosition(String str) {
        int p1 = str.indexOf('+');
        int p2 = str.indexOf('=');
        if (p1 >= p2 - 1) return false;
        if (p1 < 1) return false;
        if (p2 < 3) return false;
        return true;
    }
    private boolean isValidChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') continue;
            if (str.charAt(i) == '=') continue;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') continue;
            return false;
        }
        return true;
    }
}