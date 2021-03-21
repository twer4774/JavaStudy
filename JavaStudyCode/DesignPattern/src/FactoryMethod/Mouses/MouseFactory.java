package FactoryMethod.Mouses;

public class MouseFactory {
    public MouseInterface createMouse(String type){
        MouseInterface mouse = null;
        switch (type){
            case "LG":
                mouse = new LGMouse();
                break;

            case "Samsung":
                mouse = new SamsungMouse();
                break;
        }

        return mouse;
    }
}
