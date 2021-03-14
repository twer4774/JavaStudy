package practice;

/**
 * 4번 연습문제 다음 코드는 오류가 발생합니다. 이유는?
 *
 */

class Employee{
    public String name;
    public String grade;

    public Employee(String name){
        this.name = name;
    }
}

class Engineer extends Employee{
    private String skillSet;

    public Engineer(String name){
        super(name);
    }

    public String getSkillSet(){
        return skillSet;
    }
    public void setSkillset(String skillSet){
        this.skillSet = skillSet;
    }
}
public class AnswerOfError {


}

//답 : => 디폴트 생성자가 없으므로 자식 클래스에서 super키워드로 생성자 호출 필요