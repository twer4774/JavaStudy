package custom;

/**
 * 민수와 철수가 길에서 지갑을 발견
 * 지갑 안에는 얼마가 들어 있는지 모름
 * 서로 내기를 해서 5000원 미만이면 민수의 돈이 되고
 * 5000춴 초과면 철수의 돈이 됨
 * 단, 5000원이면 주인을 찾아서 돌려줌
 */
public class ChulsuMinsuExecution {

    static Person culsu = new Person("철수", 10000);
    static Person minsu = new Person("민수", 4000);

    public static void main(String[] args) {

        String owner = "주인";

        System.out.println("지갑을 줍기전 -----------");
        System.out.println("철수가 소지한 금액 : " + culsu.getMoney());
        System.out.println("민수가 소지한 금액 : " + minsu.getMoney());
        System.out.println();

//        Wallet wallet1 = new Wallet(3000);
//        chooseOwner(wallet1);
//       System.out.println("돈의 주인은? " + wallet1.getOwner());

//        Wallet wallet2 = new Wallet(5000);
//        chooseOwner(wallet2);
//        System.out.println("돈의 주인은? " + wallet2.getOwner());

        Wallet wallet3 = new Wallet(7000);
        chooseOwner(wallet3);
        System.out.println("돈의 주인은? " + wallet3.getOwner());


        System.out.println();
        System.out.println("돈의 주인을 정한 후 -----------");
        System.out.println("철수가 소지한 금액 : " + culsu.getMoney());
        System.out.println("민수가 소지한 금액 : " + minsu.getMoney());
    }

    public static void chooseOwner(Wallet wallet){
        int money = wallet.getMoney();
        if(money == 5000){
            wallet.setOwner("주인");
        }
        //5000원 미만이면, 민수가 갖습니다.
        else if(money < 5000){
            wallet.setOwner("민수");
            minsu.takeMoney(money);
        }
        //5000원 이상이면, 철수가 갖습니다.
        else {
            wallet.setOwner("철수");
            culsu.takeMoney(money);
        }
    }
}
