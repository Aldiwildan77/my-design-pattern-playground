package creational.factory.components;

public class Car implements Transportation {

    @Override
    public void drive() {
        System.out.println("Car: Ngengg..");
    }

    @Override
    public void horn() {
        System.out.println("Car: Beep..");
    }

}
