package DAY2.wheel;

import java.util.ArrayList;

class Wheel {
    public static final int MAX_TRY_CNT = 26;

    public static int getSum(ArrayList<StringBuilder> strs, String userdata) {
        boolean[][] isFlip = new boolean[5][50];
        int conCnt = 0;
        int[] ffirst = {0, 0, 0, 0, 0};
        int sum = 0;
        int[] chance = {-1, -1, -1, -1, -1};
        //26글자 for 돌면서 퀴즈 참석자가 하나씩 시도를 하는 것
        for (int tryCnt = 0; tryCnt < MAX_TRY_CNT; tryCnt++) {
            char tryChar = userdata.charAt(tryCnt);
            //Let's Second 점수인지 확인한다.
            for (int y = 0; y < strs.size(); y++) {
                if (chance[y] == -1) continue;
                for (int x = 0; x < strs.get(chance[y]).length(); x++) {
                    if (isFlip[chance[y]][x] == true) continue;
                    if (strs.get(chance[y]).charAt(x) != tryChar) continue;
                    sum += 2000;
                    break;
                }
                chance[y] = -1;
            }
            //Let's First 점수인지 확인한다.
            for (int y = 0; y < strs.size(); y++) {
                for (int x = 0; x < strs.get(y).length(); x++) {
                    if (isFlip[y][x] == true) continue;
                    if (strs.get(y).charAt(x) != tryChar) continue;
                    if (ffirst[y] != 0) continue;
                    ffirst[y] = 1;
                    if (x == 0) {
                        sum += 1000;
                        chance[y] = y;
                    }
                }
            }
            //$100 단위 검사
            int passCnt = getPassCnt(strs, isFlip, tryChar);
            if (passCnt > 0) {
                conCnt++;
                sum += (conCnt * 100) * passCnt;
            }
            //맞춘것 뒤집기
            flipCorrectChar(strs, isFlip, tryChar);
            //맞춘게 하나도 없는 경우, 초기화
            if (passCnt == 0) {
                conCnt = 0;
                for (int t = 0; t < 5; t++) chance[t] = -1;
            }
        }
        return sum;
    }

    private static void flipCorrectChar(ArrayList<StringBuilder> strs, boolean[][] isFlip, char tryChar) {
        for (int y = 0; y < strs.size(); y++) {
            for (int x = 0; x < strs.get(y).length(); x++) {
                if (isFlip[y][x] == true) continue;
                if (strs.get(y).charAt(x) != tryChar) continue;
                isFlip[y][x] = true;
            }
        }
    }

    private static int getPassCnt(ArrayList<StringBuilder> strs, boolean[][] isFlip, char tryChar) {
        int passCnt = 0;
        for (int y = 0; y < strs.size(); y++) {
            for (int x = 0; x < strs.get(y).length(); x++) {
                if (isFlip[y][x] == true) continue;
                if (strs.get(y).charAt(x) != tryChar) continue;
                passCnt++;
            }
        }
        return passCnt;
    }
}