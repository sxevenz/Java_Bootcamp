package Mod6;

public class Dog implements Animal {
    @Override
    public void animalisSleeping() {
        System.out.println("Dog is sleeping");
    }
    @Override
    public void animalisSpeaking() {
        System.out.println("Bark Bark");
    }

}
