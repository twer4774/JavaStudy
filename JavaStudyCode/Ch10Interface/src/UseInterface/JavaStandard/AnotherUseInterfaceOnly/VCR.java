package UseInterface.JavaStandard;

public class VCR {
    protected int counter; //VCR의 카운터
    public void play(){

    }

    public void stop(){

    }

    public void reset(){
        counter = 0;
    }

    public int getCounter(){
            return counter;
    }

    public void setCounter(int c){
        counter = c;
    }
}
