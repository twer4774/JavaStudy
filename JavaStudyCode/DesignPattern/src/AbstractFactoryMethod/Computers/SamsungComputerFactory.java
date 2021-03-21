package AbstractFactoryMethod.Computers;

import AbstractFactoryMethod.Keyboards.KeyboardInterface;
import AbstractFactoryMethod.Keyboards.SamsungKeyboard;
import AbstractFactoryMethod.Mouses.MouseInterface;
import AbstractFactoryMethod.Mouses.SamsungMouse;

public class SamsungComputerFactory implements ComputerFactory{

    @Override
    public KeyboardInterface createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public MouseInterface createMouse() {
        return new SamsungMouse();
    }
}
