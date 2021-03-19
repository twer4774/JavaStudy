package   Overriding.VirtualMethod;

import Overriding.Customer;
import Overriding.VIPCustomer;

public class OverridingTest {
    public static void main(String[] args) {
        int price = 10000;

        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은" + customerLee.calcPrice(price));

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 1234);
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은" + customerKim.calcPrice(price));

        Customer vc = new VIPCustomer(10030, "나몰라", 2000);
        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은" + vc.calcPrice(price));
    }
}
