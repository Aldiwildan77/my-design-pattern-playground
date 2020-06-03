package creational.abstract_factory.foods;

import creational.abstract_factory.foods.corn.SaltedCorn;
import creational.abstract_factory.foods.tofu.SaltedTofu;

public class SaltedFactory extends FoodFactory {

    @Override
    public Food getFood(String type) {
        if (type.equalsIgnoreCase("corn")) {
            return new SaltedCorn();
        } else if (type.equalsIgnoreCase("tofu")) {
            return new SaltedTofu();
        } else {
            return null;
        }
    }

}
