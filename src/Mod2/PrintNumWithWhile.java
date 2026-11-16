package Mod2;

public class PrintNumWithWhile {

    static int OddNums(int range){
        int i = 0;
        int count = 0;
        while (i <= range){
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(   OddNums(100));
    }
}
