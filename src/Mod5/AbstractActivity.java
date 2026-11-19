package Mod5;

public class AbstractActivity {
    public static void main(String args[]) {
        // TODO: Create a Rectangle object, set color to "Blue", and print the color
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        System.out.println("Rectangle color: " + rectangle.getColor());
        // TODO: Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
        System.out.println("Perimeter " + rectangle.CalculatePerimeter(2,4,0) + " Area: " + rectangle.CalculateArea(2,4,0));

        // TODO: Create a Circle object, set color to "Pink", and print the color
        Circle circle = new Circle();
        circle.setColor("Pink");
        System.out.println("Circle color: " + circle.getColor());
        // TODO: Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)
        System.out.println("Perimeter " + circle.CalculatePerimeter(0,0,5) + " Area: " + circle.CalculateArea(0,0,5));
    }
}
