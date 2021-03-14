package   Overriding;

public class VIPCustomer extends Customer{

    private int agentID; //VIP 고객 담당 상담원 아이디
    double saleRatio; //할인율

//    public VIPCustomer(){
//        customerGrade = "VIP"; //고객 등급 VIP
//        bonusRatio = 0.05; //보너스 적립 5%
//        saleRatio = 0.1; //할인율 10%
//        //하위 클래스를 생성할 때 출력
//        System.out.println("VIPCustomer() 생성자 호출");
//    }
    public VIPCustomer(int customerID, String customerName, int agentID){
        //상위 클래스 생성자 호출
        super(customerID, customerName);
        customerGrade = "VIP"; //고객 등급 VIP
        bonusRatio = 0.05; //보너스 적립 5%
        saleRatio = 0.1; //할인율 10%
        this.agentID = agentID;
        //하위 클래스를 생성할 때 출력
        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    //VIP 고객에게만 필요한 메소드
    public int getAgentID(){
        return agentID;
    }

}
