package creational.abstract_factory.foods.corn;

import creational.abstract_factory.foods.Food;

public class SaltedCorn implements Food {

    @Override
    public void make() {
        System.out.println("Food: SaltedCorn");
    }

}
