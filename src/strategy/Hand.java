package strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // 주먹
    public static final int HANDVALUE_CHO = 1; // 가위
    public static final int HANDVALUE_PAA = 2; // 보
    public static final Hand[] hand = {new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA)}; // 3개의 손을 의미하는 인스턴스

    private static final String[] name = {"주먹", "가위", "보"};

    private int handValue; // 가위바위보의 손의 값

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue){
        return hand[handValue];
    }

    public boolean isStringerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) { //0,1,2(주먹, 가위, 보)내에서만 판단하기 위해 %3을 하는 것
            return -1;
        } else {
            return -1;
        }
    }

    public String toString(){
        return name[handValue];
    }
}
