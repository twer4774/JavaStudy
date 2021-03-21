package AbstractFactoryMethod.Computers;

import AbstractFactoryMethod.Keyboards.KeyboardInterface;
import AbstractFactoryMethod.Keyboards.LGKeyboard;
import AbstractFactoryMethod.Mouses.LGMouse;
import AbstractFactoryMethod.Mouses.MouseInterface;

public class LGComputerFactory implements ComputerFactory{

    @Override
    public KeyboardInterface createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public MouseInterface createMouse() {
        return new LGMouse();
    }
}
