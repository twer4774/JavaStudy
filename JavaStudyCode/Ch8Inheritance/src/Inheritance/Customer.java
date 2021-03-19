package   Inheritance;

public class Customer {
    //상속에서 사용하기 위해 private -> protected로 변환필요. 해당변수들 사용을 위해 getter,setter추가
    private int customerID; //고객 아이디
    private String customerName; //고객 이름
    protected String customerGrade; //고객 등급


    int bonusPoint; //보너스 포인트
    double bonusRatio; //적립 비율

    public Customer(){
        customerGrade = "SILVER"; //기본 등급
        bonusRatio = 0.01; //보너스 포인트 기본 적립 비용
    }

    //보너스 포인트 적립, 지불 가격 계산 메소드
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio; //보너스 포인트 계산
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
