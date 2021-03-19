package   Inheritance;

public class VIPCustomer extends Customer {

    private int agentID; //VIP 고객 담당 상담원 아이디
    double saleRatio; //할인율

    public VIPCustomer() {
        customerGrade = "VIP"; //고객 등급 VIP
        bonusRatio = 0.05; //보너스 적립 5%
        saleRatio = 0.1; //할인율 10%
    }

    //VIP 고객에게만 필요한 메소드
    public int getAgentID() {
        return agentID;
    }

}