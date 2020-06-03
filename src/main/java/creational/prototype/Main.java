package creational.prototype;

import creational.prototype.components.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cS1 = ShapeCache.getShape("1");
        System.out.println("Cloned Shape 1 is " + cS1.getType());

        Shape cS2 = ShapeCache.getShape("2");
        System.out.println("Cloned Shape 2 is " + cS2.getType());

        Shape cS3 = ShapeCache.getShape("3");
        System.out.println("Cloned Shape 3 is " + cS3.getType());
    }

}
