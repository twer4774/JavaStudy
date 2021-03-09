package Practice.ObjectCooperation;

public class StarCafe {

    private String beverageName;
    private int salesBeverageCount; //음료판매 수
    private int salesMoney; //판매액

    public StarCafe(String beverageName) {
        this.beverageName = beverageName;
    }

    public void ordered(int price){
        salesBeverageCount++;
        this.salesMoney += price;
    }

    public void showInfo(){
        System.out.println("StarCafe의 " + beverageName + " 판매 개수는 : " + salesBeverageCount + " 판매액은 : " + salesMoney);
    }


}
