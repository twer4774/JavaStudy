package TemplateMethod.player;


public class Player {
    private PlayerLevel level;

    //디폴트 생성자. 처음 생성되면 초급자 레벨로 시작하며, 레벨 메시지를 출력한다.
    public Player(){
        level = new Beginner();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel(){
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        //템플릿 메소드 호출
        level.go(count);
    }
}
