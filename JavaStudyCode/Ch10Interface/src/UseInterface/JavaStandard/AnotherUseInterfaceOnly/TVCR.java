package UseInterface.JavaStandard;

/**
 * 클래스 상속, 인터페이스 구현
 */
public class TVCR extends Tv implements IVCR{

    VCR vcr = new VCR();

    @Override
    public void play() {
        vcr.play();
    }

    @Override
    public void stop() {
        vcr.stop();
    }

    @Override
    public void reset() {
        vcr.reset();
    }

    @Override
    public int getCounter() {
        return vcr.getCounter();
    }

    @Override
    public void setCounter(int c) {
        vcr.setCounter(c);
    }
}
