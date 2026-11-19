package Mod6;


public class Cat implements Animal {
    @Override
    public void animalisSleeping() {
        System.out.println("Cat is sleeping");
    }
    @Override
    public void animalisSpeaking() {
        System.out.println("Meow Meow");
    }
}
