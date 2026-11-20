package Mod10;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero" + e.getMessage());
            throw e;
        }
    }public int multiply ( int a, int b) throws InvalidInputException {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers are not allowed");
            }
            return a*b;
        }
        catch (InvalidInputException e) {
            System.out.println("Multiplication error" + e.getMessage());
            throw e;
        }
    }}
