package Practice.ObjectCooperation.another;

public class Person implements PersonInterface{

    private String name;
    private int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    @Override
    public void order(Cafe cafe, int price){
        cafe.orderCoffee(price);
        this.money -= price;
    }

    @Override
    public void showInfo() {
        System.out.println(name + "씨의 남은 금액은 : " + money);
    }
}
