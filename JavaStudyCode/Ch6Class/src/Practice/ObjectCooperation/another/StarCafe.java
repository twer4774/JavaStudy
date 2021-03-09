package Practice.ObjectCooperation.another;

public class StarCafe extends Cafe{

    private static final String cafeName = "StarCafe";

    //Cafe가 추상 클래스일 경우
    public StarCafe(String beverageName){
        super(cafeName, beverageName);
    }

    //Cafe가 일반 클래스일 경우. 인스턴스가 생성가능하므로 cafeName을 넣기 위해 넣음
    public StarCafe(String cafeName, String beverageName) {
        super(cafeName, beverageName);
    }

}
