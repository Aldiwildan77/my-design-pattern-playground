package creational.abstract_factory;

import creational.abstract_factory.foods.FoodFactory;
import creational.abstract_factory.foods.SaltedFactory;
import creational.abstract_factory.foods.SweetFactory;

public class FoodFactoryProducer {

    public static FoodFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("salted")) {
            return new SaltedFactory();
        } else if (factoryType.equalsIgnoreCase("sweet")) {
            return new SweetFactory();
        } else {
            return null;
        }
    }

}
