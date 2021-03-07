package SelfCoding;

/**
 * 쇼핑몰에 주문이 들어왔습니다.
 * 주문 내용에 대한 클래스를 만들고 주문 내용을 인스턴스로 생성 후 주문내용을 그대로 출력
 */
class ShoppingInfo{
    long orderNumber; //주문 번호
    String orderID; //주문자 아이디
    String orderDate; //주문날짜
    String orderName; //주문자 이름
    String orderProductNumber; //주문 상품 번호
    String address; //배송 주소

    public String toString(){
        return "주문 번호 : " + orderNumber + "\n"
                + "주문자 아이디 : " + orderID + "\n"
                + "주문 날짜 : " + orderDate + "\n"
                + "주문자 이름 : " + orderName + "\n"
                + "주문 상품 번호 : " + orderProductNumber + "\n"
                + "배송주소 : " + address;

    }
}

public class Shopping {
    public static void main(String[] args) {
        ShoppingInfo shoppingInfo = new ShoppingInfo();

        //int로 표현하기 너무 큰 숫자라서 long 타입으로 설정
        shoppingInfo.orderNumber = 201803120001L;
        shoppingInfo.orderID = "abc123";
        shoppingInfo.orderDate = "2018년 3월 12일";
        shoppingInfo.orderName = "홍길순";
        shoppingInfo.orderProductNumber = "PD0345-12";
        shoppingInfo.address = "서울시 영등포구 여의도동 20번지";

        System.out.println(shoppingInfo.toString());
    }
}
