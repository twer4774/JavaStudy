package custom;

public class Wallet {

    private final int money;
    private String owner;

    public Wallet(int money){
        this.money = money;
    }


    public int getMoney() {
        return money;
    }

    public String getOwner() { return owner; }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    //주인을 출력하는 메소드
//    public void showOwner(){
//        if(owner == "주인"){
//            System.out.println("주인을 찾아줍니다.");
//        }
//        else {
//            System.out.println("주인은 : " + owner + "입니다.");
//        }
//    }


}
