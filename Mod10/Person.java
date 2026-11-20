package Mod10;
//Activity 1
public abstract class  Person {
    // private so any other class can`t reach withour check
    private String  name;
    private  int age;

    protected Person(){
    }

    protected Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    //setter for age with invalid value check
    public void setAge(int age) {
        if (age > 0 ) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Age must be greater than zero");
        }

    }
    //getter for name
    public String getName() {
        return name;
    }
    //getter for age
    public int getAge() {
        return age;
    }
    //introduce method
    public void introduce() {
        System.out.println("Hello my name is " + name + " , " + "I`m " + age + " years old.");
    }

}
