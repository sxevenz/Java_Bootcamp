package Mod2;

public class FindLargest {

    static String findLargest(int a, int b) {
        int largest = 0;
        if (a < b) {
            largest = b;
        }
        else {
            largest = a;
        }
        return String.valueOf(largest);
    }

    public static void main(String[] args) {
        System.out.println(findLargest(1,2));


    }
}
