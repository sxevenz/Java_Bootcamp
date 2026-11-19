package Mod5;

public class Circle extends Shape {
    @Override
    public double CalculateArea(double length, double breadth, double radius) {
        return Math.PI*radius*radius;
    }
    @Override
    public double CalculatePerimeter(double length, double breadth, double radius) {
        return 2 * Math.PI*radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.CalculateArea(1,1,1));
    }
}

