package Practice.ObjectCooperation.another;



public class DrinkTest {

    public static void main(String[] args) {
        Person personKim = new Person("Kim", 50000);
        Person personLee = new Person("Lee", 70000);

//        Cafe americano = new Cafe("starCafe", "americano");
        StarCafe starCafe = new StarCafe("americano");
        personKim.order(starCafe, 4000);
//        personKim.order(americano, 4000);
        personKim.showInfo();
        starCafe.showInfo();
        System.out.println(starCafe.getCafe());

//        Cafe latte = new Cafe("kongCafe", "latte");
        KongCafe kongCafe = new KongCafe("latte");
        personLee.order(kongCafe, 4500);
//        personLee.order(latte, 4500);
//        personLee.order(americano, 4000);
        personLee.showInfo();
        kongCafe.showInfo();

//        americano.showInfo();




    }
}
