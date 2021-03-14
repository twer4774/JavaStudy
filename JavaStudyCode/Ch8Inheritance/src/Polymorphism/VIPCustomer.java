package   Polymorphism;

public class VIPCustomer extends Customer {

    private int agentID; //VIP 고객 담당 상담원 아이디
    double saleRatio; //할인율

    public VIPCustomer(int customerID, String customerName, int agentID){
        //상위 클래스 생성자 호출
        super(customerID, customerName);
        customerGrade = "VIP"; //고객 등급 VIP
        bonusRatio = 0.05; //보너스 적립 5%
        saleRatio = 0.1; //할인율 10%
        this.agentID = agentID;
    }

    //VIP 고객에게만 필요한 메소드
    public int getAgentID(){
        return agentID;
    }

    //메소드 오버라이딩
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //포인트 적립
        return price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환
    }

}
