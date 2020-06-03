package creational.prototype.components;

public class Circle extends Shape {

    public Circle() {
        setType("Circle");
    }

    @Override
    void draw() {
        System.out.println("Drawing: " + getType());
    }

}
