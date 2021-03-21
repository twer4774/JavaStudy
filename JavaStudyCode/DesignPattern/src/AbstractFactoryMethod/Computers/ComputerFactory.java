package AbstractFactoryMethod.Computers;

import AbstractFactoryMethod.Keyboards.KeyboardInterface;
import AbstractFactoryMethod.Mouses.MouseInterface;

public interface ComputerFactory {
    public KeyboardInterface createKeyboard();
    public MouseInterface createMouse();
}
