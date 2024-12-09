public class day_1_2 {
    static String getResult(String str) {
        int flag1 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int p1 = 0, p2 = 0;
        //+와 = 개수 확인
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                cnt1++;
                p1 = i;
            }
            else if (str.charAt(i) == '=') {
                cnt2++;
                p2 = i;
            }
            else if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                flag1 = 1;
                break;
            }
        }
        int flag2 = 0;
        if (cnt1 == 1 && cnt2 == 1 && p1 < p2 - 1 && flag1 == 0) {
            if (p1 >= 1 && p2 >= 3 && p2 < str.length() - 1) {
                flag2 = 1;
                String num1 = str.substring(0, p1);
                String num2 = str.substring(p1 + 1, p2);
                String num3 = str.substring(p2 + 1);
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int n3 = Integer.parseInt(num3);
                if (n1 + n2 == n3) {
                    //System.out.println("PASS");
                    return "PASS";
                }
                else {
                    //System.out.println("FAIL");
                    return "FAIL";
                }
            }
        }
        else {
            //System.out.println("ERROR");
            flag2 = 1;
            return "ERROR";
        }
        if (flag2 == 0) {
            //System.out.println("ERROR");
            return "ERROR";
        }
        return null;
    }
}
