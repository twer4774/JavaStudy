package custom;

public class Person {

    private final String name;
    private int money; //사람이 기존에 갖고 있던 금액


    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //돈을 갖게되어 소지하는 금액이 증가한다.
    public void takeMoney(int money){
        this.money += money;
    }

}
