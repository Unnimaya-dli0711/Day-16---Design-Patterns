package org.example.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("square");
        shape2.draw();
    }
}
