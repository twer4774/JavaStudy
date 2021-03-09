package Practice.ObjectCooperation;

/**
 * 김씨는 별다방에서 4000원 아메리카노
 * 이씨는 콩다방에서 4500원 라떼
 */
public class DrinkTest {

    public static void main(String[] args) {
        Person personKim = new Person("Kim", 50000);
        Person personLee = new Person("Lee", 70000);

        StarCafe americano = new StarCafe("americano");
        personKim.orderStar(americano);
        personKim.showInfo();
        americano.showInfo();

        KongCafe latte = new KongCafe("latte");
        personLee.orderKong(latte);
        personLee.showInfo();
        latte.showInfo();
    }




}
