package creational.factory.components;

public class Motorcycle implements Transportation {

    @Override
    public void drive() {
        System.out.println("Motorcycle: Ngengg..");
    }

    @Override
    public void horn() {
        System.out.println("Motorcycle: beep..");
    }

}
