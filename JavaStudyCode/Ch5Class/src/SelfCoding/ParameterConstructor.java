package SelfCoding;

/**
 * 나 혼자 코딩
 * 매개변수가 있는 생성자 추가하기
 * Person 클래스에 이미 추가된 생성자 외에 이름, 키, 몸무게를 매개변수로 받는 생성자 추가
 * 그리고 PersonTest.java 클래스에서 추가된 생성자를 사용하여 인스턴스 생성
 */

class ParameterPerson{
    String name;
    float height;
    float weight;

    public ParameterPerson(){} //디폴트 생성자. 커스텀 생성자를 이용하면 디폴트 생성자를 직접 입력해줘야 함

    public ParameterPerson(String pname){
        name = pname; //사람 이름을 매개변수로 입력받아서 Person클래스를 생성하는 생성자
    }

    public ParameterPerson(String pname, float pheight, float pweight) {
        name = name;
        height = pheight;
        weight = pweight;
    }


    public String toString(){
        return "name: " + name + " "
                + "height: " + height + " "
                + "weight: " + weight + " ";
    }

}

//PersonTest.java 대체
public class ParameterConstructor {
    public static void main(String[] args) {
        ParameterPerson parameterPerson1 = new ParameterPerson();
        System.out.println(parameterPerson1.toString());

        ParameterPerson parameterPerson2 = new ParameterPerson("walter");
        System.out.println(parameterPerson2.toString());

        ParameterPerson parameterPerson3 = new ParameterPerson("walter", 100.2f, 100.1f);
        System.out.println(parameterPerson3.toString());


    }
}
