package creational.abstract_factory.foods;

import creational.abstract_factory.foods.corn.SweetCorn;
import creational.abstract_factory.foods.tofu.SweetTofu;

public class SweetFactory extends FoodFactory {

    @Override
    public Food getFood(String type) {
        if (type.equalsIgnoreCase("corn")) {
            return new SweetCorn();
        } else if (type.equalsIgnoreCase("tofu")) {
            return new SweetTofu();
        } else {
            return null;
        }
    }

}
