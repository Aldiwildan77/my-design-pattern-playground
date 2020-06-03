package creational.factory;

import creational.factory.components.Transportation;

public class Main {

    public static void main(String[] args) {
        GojekFactory gojek = new GojekFactory();

        Transportation car = gojek.getTransportation("Car");
        Transportation motorcycle = gojek.getTransportation("Motorcycle");

        System.out.println();
        car.drive();
        motorcycle.drive();

        System.out.println();
        car.horn();
        motorcycle.horn();
    }

}
