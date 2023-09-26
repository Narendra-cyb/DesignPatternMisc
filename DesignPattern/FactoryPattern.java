package DesignPattern;
interface Shape{
    void draw();
}
class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Circle draw");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Square draw");
    }
}
interface ShapeFactory{
    Shape createShape();
}
class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape(){
        return new Circle();
    }
}
class SquareFactory implements ShapeFactory{
    @Override
    public Shape createShape(){
        return new Square();
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory ciFactory = new CircleFactory();
        Shape circle = ciFactory.createShape();
        circle.draw();
    }
    
}
