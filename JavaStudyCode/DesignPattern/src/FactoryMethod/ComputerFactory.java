package FactoryMethod;

import FactoryMethod.Keyboards.KeyboardFactory;
import FactoryMethod.Mouses.MouseFactory;

public class ComputerFactory {
    public void createComputer(String type){
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();

        keyboardFactory.createKeyboard(type);
        mouseFactory.createMouse(type);
        System.out.println("--- " + type + " 컴퓨터 완성 ---");
    }
}

//만약 스피커, 본체 등 여러 주변기기들을 추가한다면??=> 각 팩토리 클래스 객체를 생성
//컴퓨터 생산시 모두 동일한 제조사로 맞춰야함 => 일일이 작업 필요 => 추상팩토리패턴
//public class ComputerFactory {
//    public void createComputer(String type){
//        KeyboardFactory keyboardFactory = new KeyboardFactory();
//        MouseFactory mouseFactory = new MouseFactory();
//        BodyFactory bodyFactory = new BodyFactory();
//        MonitorFactory monitorFactory = new MonitorFactory();
//        SpeakerFactory speakerFactory = new SpeakerFactory();
//        PrinterFactory printerFactory = new PrinterFactory();
//
//        keyboardFactory.createKeyboard(type);
//        mouseFactory.createMouse(type);
//        bodyFactory.createBody(type);
//        monitorFactory.createMonitor(type);
//        speakerFactory.createSpeaker(type);
//        printerFactory.createPrinter(type);
//        System.out.println("--- " + type + " 컴퓨터 완성 ---");
//    }
//}
