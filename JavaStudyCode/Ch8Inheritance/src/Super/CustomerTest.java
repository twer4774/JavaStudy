package   Super;

public class CustomerTest {

    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerID(10010);
//        customerLee.setCustomerName("이순신");
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customKim = new VIPCustomer(10020, "김유신", 90001);
//        customKim.setCustomerID(10020);
//        customKim.setCustomerName("김유신");
        customKim.bonusPoint = 1000;
        System.out.println(customKim.showCustomerInfo());
    }

}
