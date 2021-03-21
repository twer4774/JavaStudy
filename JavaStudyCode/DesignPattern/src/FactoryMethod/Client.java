package FactoryMethod;

/**
 *클라이언트 요청(제조사)
 */
public class Client {
    public static void main(String args[]){
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("LG");
    }
}
