package Practice.Singleton;

public class Card {
    private static int serialNumber = 100;

    public int getCardNumber() {
        return cardNumber;
    }

    public Card(){
        serialNumber++;
        cardNumber = serialNumber;
    }

    private int cardNumber;

}
