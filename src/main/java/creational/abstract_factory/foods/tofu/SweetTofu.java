package creational.abstract_factory.foods.tofu;

import creational.abstract_factory.foods.Food;

public class SweetTofu implements Food {

    @Override
    public void make() {
        System.out.println("Food: SweetTofu");
    }

}
