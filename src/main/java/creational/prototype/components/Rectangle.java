package creational.prototype.components;

public class Rectangle extends Shape {

    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    void draw() {
        System.out.println("Drawing: " + getType());
    }

}
