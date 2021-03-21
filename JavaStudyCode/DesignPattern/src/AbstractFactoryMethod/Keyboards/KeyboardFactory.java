package AbstractFactoryMethod.Keyboards;


public class KeyboardFactory {
    public KeyboardInterface createKeyboard(String type){
        KeyboardInterface keyboard = null;
        switch (type){
            case "LG":
                keyboard = new LGKeyboard();
                break;

            case "Samsung":
                keyboard = new SamsungKeyboard();
                break;
        }

        return keyboard;
    }
}
