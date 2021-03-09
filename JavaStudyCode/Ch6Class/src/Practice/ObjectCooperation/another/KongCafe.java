package Practice.ObjectCooperation.another;

public class KongCafe extends Cafe{

    private static final String cafeName="KongCafe";

    public KongCafe(String beverageName){
        super(cafeName, beverageName);
    }

    public KongCafe(String cafeName, String beverageName) {
        super(cafeName, beverageName);
    }


}
