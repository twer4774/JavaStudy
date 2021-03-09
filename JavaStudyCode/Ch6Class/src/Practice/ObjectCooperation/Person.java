package Practice.ObjectCooperation;

public class Person {

    public String name;
    public int money; //가지고 있는 금액

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void orderStar(StarCafe starCafe){
        starCafe.ordered(4000);
        this.money -= 4000;
    }

    public void orderKong(KongCafe kongCafe) {
        kongCafe.ordered(4500);
        this.money -= 4500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void showInfo(){
        System.out.println(name + "씨의 남은 금액은 : " + money);
    }
}
