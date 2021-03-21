package AbstractFactoryMethod;

import AbstractFactoryMethod.Computers.ComputerFactory;
import AbstractFactoryMethod.Computers.LGComputerFactory;
import AbstractFactoryMethod.Computers.SamsungComputerFactory;

public class FactoryOfComputerFactory {
    public void createComputer(String type){
        ComputerFactory computerFactory= null;
        switch (type){
            case "LG":
                computerFactory = new LGComputerFactory();
                break;

            case "Samsung":
                computerFactory = new SamsungComputerFactory();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
