package Polymorphism;

public class Customer {

    protected int customerID; //고객 아이디
    protected String customerName; //고객 이름
    protected String customerGrade; //고객 등급
    int bonusPoint; //보너스 포인트
    double bonusRatio; //적립 비율

    //매개변수가 있는 생성자
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    //보너스 포인트 적립, 지불 가격 계산 메소드
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio; //보너스 포인트 계산
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
