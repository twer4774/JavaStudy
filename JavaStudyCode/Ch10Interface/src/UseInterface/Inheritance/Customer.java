package UseInterface;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    @Override
    public void order() {
        System.out.println("고객 판매 주문");
    }
}
