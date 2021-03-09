package Practice.ObjectCooperation.another;

public abstract class Cafe implements CafeInterface{

    private String cafeName;
    private String beverageName;
    private int saleBeverageCount; //음료판매수
    private int salesMoney; //판매액


    //어느 카페의 어떤 음료
    public Cafe(String cafeName, String beverageName){
        this.cafeName = cafeName;
        this.beverageName = beverageName;
    }

    public String getCafe() {
        return cafeName;
    }

    public void setCafe(String cafe) {
        this.cafeName = cafe;
    }

    //주문
    @Override
    public void orderCoffee(int price) {
        saleBeverageCount++;
        this.salesMoney += price;
    }

    //정보
    @Override
    public void showInfo() {
        System.out.println(cafeName + "의 " + beverageName + " 판매 개수는 : " + saleBeverageCount + " 판매액은 : " + salesMoney);

    }


}
