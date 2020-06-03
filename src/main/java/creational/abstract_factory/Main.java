package creational.abstract_factory;

import creational.abstract_factory.foods.Food;
import creational.abstract_factory.foods.FoodFactory;

public class Main {

    public static void main(String[] args) {
        FoodFactory saltedFactory = FoodFactoryProducer.getFactory("salted");
        FoodFactory sweetFactory = FoodFactoryProducer.getFactory("sweet");

        assert saltedFactory != null;
        assert sweetFactory != null;

        Food corn1 = saltedFactory.getFood("corn");
        Food corn2 = sweetFactory.getFood("corn");

        Food tofu1 = saltedFactory.getFood("tofu");
        Food tofu2 = sweetFactory.getFood("tofu");

        corn1.make();
        corn2.make();
        tofu1.make();
        tofu2.make();
    }

}
