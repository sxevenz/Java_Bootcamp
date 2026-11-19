package Mod6;

public class AnimalActivity {
    public static void main(String arg[]) {

        // TODO: Use interfaces to declare identifiers instead of the actual classes (create Cat using interface Animal)
        Animal cat = new Cat();
        // TODO: Create Dog using interface Animal
        Animal dog = new Dog();
        Animal cow = new Cow();
        Mammal mammal = new Mammal("Flexy");

        // TODO: For mammal set animal to cat
        mammal.setAnimal(cat);
        // TODO: Execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();
        // TODO: Execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();
        // TODO: For mammal set animal to dog
        mammal.setAnimal(dog);
        // TODO: Execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();
        // TODO: Execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();
        mammal.setAnimal(cow);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}
