package SelfCoding;

/**
 * 나혼자 코딩 : 사칙 연산 함수 완성하기
 */
public class FourRuleCalculations {

    static int add(int n1, int n2){
        return n1 + n2;
    }

    static int dif(int n1, int n2){
        return n1 - n2;
    }

    static int multi(int n1, int n2){
        return n1 * n2;
    }

    static int div(int n1, int n2){
        try{
            return n1/n2;
        }
        //0으로 나누었을 때 예외 처리
        catch (Exception e){
            System.out.println("0으로 나눌 수 없습니다. 0으로 출력됩니다.");
            return 0;
        }
    }

    public static void main(String[] args) throws Exception{
        System.out.println(add(3, 5));
        System.out.println(dif(5, 3));
        System.out.println(multi(3, 5));
        System.out.println(div(3, 0));
        System.out.println(div(4, 3));
    }
}
