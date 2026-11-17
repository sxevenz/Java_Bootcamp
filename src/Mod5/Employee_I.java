package Mod5.Activity1;

public class Employee_I extends Person_I {
    // Attributes

    private double salary;

    private String title;

    // Behavior

    // TODO: Write default constructor. Print "I'm an Employee_I Constructor"
    public Employee_I() {
        System.out.println("I`m an Employee_I constructor");
    }
    // TODO: Write getter for double salary
    public double getSalary() {
        return salary;
    }
    // TODO: Write setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // TODO: Write getter for String title
    public String getTitle() {
        return title;
    }
    // TODO: Write setter for String title
    public void setTitle(String title) {
        this.title = title;
    }
}
