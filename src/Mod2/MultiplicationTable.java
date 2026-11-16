package Mod2;

public class MultiplicationTable {
    static String MultiplicationTablee(int a, int b){
       for(int x = 1; x <= 10; x++){
            for (int i = a; i <= b; i++){
                int result = x * i;
                System.out.print( i + " * " + x + " = " + result + " " );

        }
           System.out.println(" ");
           System.out.println(" ");
        }
        return "Done";
    }

    public static void main(String[] args) {
        System.out.println(MultiplicationTablee(11,20));
    }
}
