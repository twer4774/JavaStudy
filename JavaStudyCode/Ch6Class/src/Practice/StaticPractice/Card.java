package Practice.StaticPractice;

/**
 * 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여
 * 카드가 생성될 때 마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성
 */
public class Card {
    private static int serialNum = 100;

    public int getCardNumber() {
        return cardNumber;
    }

    private int cardNumber;

    public Card(){
        serialNum++;
        cardNumber = serialNum;
    }
}
