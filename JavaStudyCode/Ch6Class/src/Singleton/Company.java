package Singleton;

public class Company {

    //유일하게 생성한 인스턴스
    private static Company instance = new Company();

    private Company(){}

    //외부에서 참조할 수 있는 public 메소드
    public static Company getInstance() {
        if(instance == null){
            instance = new Company();
        }

        return instance; //유일하게 생성한 인스턴스
    }
}
