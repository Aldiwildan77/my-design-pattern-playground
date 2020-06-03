package creational.factory;

import creational.factory.components.Car;
import creational.factory.components.Motorcycle;
import creational.factory.components.Transportation;

public class GojekFactory {

    public Transportation getTransportation(String type) {
        if (type == null) return null;

        switch (type) {
            case "Motorcycle":
                System.out.println("Motorcycle Created");
                return new Motorcycle();
            case "Car":
                System.out.println("Car Created");
                return new Car();
        }

        return null;
    }
}
