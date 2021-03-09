package Practice.Singleton;

public class CardCompany {

    //유일하게 생성한 인스턴스
    private static CardCompany instance = new CardCompany();

    private CardCompany(){}

    //외부에서 참조할 수 있는 메소드
    public static CardCompany getInstance() {
        if(instance == null){
            instance = new CardCompany();
        }

        return instance;
    }

    public Card createCard(){
        Card card = new Card();
        return card;
    }
}
