package Generics;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<Powder>();

        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter);


        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<Plastic>();

        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();
        System.out.println(plasticGenericPrinter);
    }

}
