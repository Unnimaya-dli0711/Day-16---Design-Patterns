package org.example.factory;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape==null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
