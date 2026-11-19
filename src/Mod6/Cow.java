package Mod6;

public class Cow implements Animal {
    @Override
    public void animalisSleeping() {
        System.out.println("Cow is sleeping");
    }

    @Override
    public void animalisSpeaking() {
        System.out.println("Moo Moo");
    }
}
