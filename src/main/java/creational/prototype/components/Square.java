package creational.prototype.components;

public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    @Override
    void draw() {
        System.out.println("Drawing: " + getType());
    }

}
