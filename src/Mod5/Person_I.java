package Mod5;

    public class Person_I {

        // Attributes

        private String name;

        private int age;

        // Behavior

        // TODO: Write default constructor. Print "I'm Person_I constructor"
        public Person_I(){
            System.out.println("I'm Person_I constructor");
        }

        // TODO: Write parameterized constructor with variables name and age
        public Person_I(String name, int age){
            this.name = name;
            this.age = age;
        }

        // TODO: Write getter for String name
        public String getName(){
            return name;
        }
        // TODO: Write setter for String name

        public void setName(String name) {
            this.name = name;
        }

        // TODO: Write getter for int age
        public int getAge(){
            return age;
        }
        // TODO: Write setter for int age
        public void setAge(int age){
            this.age = age;
        }
    }


