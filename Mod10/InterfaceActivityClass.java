package Mod10;

public class InterfaceActivityClass {
    public static void main(String args[]) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        //start
        bike.start();
        car.start();
        //stop
        bike.stop();
        car.stop();
    }
}
