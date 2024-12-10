package DAY2.wheel;

import java.util.ArrayList;

class Axis {
    int x, y;

    public Axis(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Wheel {
    public static final int MAX_TRY_CNT = 26;
    public static final int MAX_QUIZ_LINE = 4;
    public static final int MAX_QUIZ_LINE_LENGTH = 50;
    //Wheel에서 주요 데이터
    private ArrayList<StringBuilder> originAnswer;
    //Wheel에서 State
    private boolean[][] isFlip = new boolean[MAX_QUIZ_LINE][MAX_QUIZ_LINE_LENGTH];
    private boolean[] isGettingSeoncdChance = new boolean[MAX_QUIZ_LINE];
    private boolean[] isFinishFirstChance = new boolean[MAX_QUIZ_LINE];
    private int continueAnswerCount = 0;
    private int totalPrice = 0;

    public Wheel(ArrayList<StringBuilder> originAnswer) {
        this.originAnswer = originAnswer;
    }

    public int getTotalPrice(String userTotalAnswer) {
        //26글자 for 돌면서 퀴즈 참석자가 하나씩 시도를 하는 것
        for (int tryCnt = 0; tryCnt < MAX_TRY_CNT; tryCnt++) {
            char userAnswer = userTotalAnswer.charAt(tryCnt);
            ArrayList<Axis> axises = getAxis(userAnswer);
            int passCnt = axises.size();
            if (passCnt == 0) {
                clearUpContinueData();
                continue;
            }
            continueAnswerCount++;
            totalPrice += getUnitPrice(passCnt);
            totalPrice += getSecondChancePrice(axises);
            totalPrice += getFirstChancePrice(axises);
            flipCorrectChar(axises);
        }
        return totalPrice;
    }

    private ArrayList<Axis> getAxis(char tryChar) {
        ArrayList<Axis> result = new ArrayList<>();
        for (int y = 0; y < originAnswer.size(); y++) {
            for (int x = 0; x < originAnswer.get(y).length(); x++) {
                if (isFlip[y][x] == true) continue;
                if (originAnswer.get(y).charAt(x) != tryChar) continue;
                result.add(new Axis(x, y));
            }
        }
        return result;
    }

    private void clearUpContinueData() {
        continueAnswerCount = 0;
        isGettingSeoncdChance = new boolean[MAX_QUIZ_LINE];
    }

    private int getUnitPrice(int passCnt) {
        return (continueAnswerCount * 100) * passCnt;
    }

    private int getSecondChancePrice(ArrayList<Axis> axises) {
        int price = 0;
        for (Axis axis : axises) {
            if (!isGettingSeoncdChance[axis.y]) continue;
            isGettingSeoncdChance[axis.y] = false;
            price += 2000;
        }
        return price;
    }

    private int getFirstChancePrice(ArrayList<Axis> axises) {
        isGettingSeoncdChance = new boolean[MAX_QUIZ_LINE];
        int price = 0;
        for (Axis axis : axises) {
            int y = axis.y;
            int x = axis.x;
            if (isFinishFirstChance[y]) continue;
            isFinishFirstChance[y] = true;
            if (x == 0) {
                price += 1000;
                isGettingSeoncdChance[y] = true;
            }
        }
        return price;
    }

    private void flipCorrectChar(ArrayList<Axis> axises) {
        for (Axis axis : axises) {
            isFlip[axis.y][axis.x] = true;
        }
    }
}