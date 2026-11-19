package Mod5;

public class Rectangle extends Shape{
    @Override
    public double CalculateArea(double length, double breadth, double radius) {
        return length * breadth;
    };
    @Override
    public double CalculatePerimeter(double length, double breadth, double radius) {
        return (length + breadth)*2 ;
    }
}
