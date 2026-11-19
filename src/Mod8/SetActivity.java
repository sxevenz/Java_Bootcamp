package Mod8;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {
    public static void main(String[] args) {
        // TODO: 1 - Type code to create a set of names using HashSet.
        Set<String> set = new HashSet<>();
        // Add "John", "John", "Harry", and "Daniel" (and try adding a few more duplicate entries).

        set.add("John");
        set.add("Harry");
        set.add("Daniel");
        set.add("John");
        set.add("Daniel");
        set.add("John");



        // TODO: 2 - Call print method to print the set passed as its parameter.

        print(set);

    }

    static void print(Set set) {
        // TODO: 3 - Type code to print this set
        for (Object o : set) {
            System.out.println(o);
        }
        // Notice the order in which elements get printed and whether duplicates appear.

    }
}
