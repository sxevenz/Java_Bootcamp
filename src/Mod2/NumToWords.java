package Mod2;

public class NumToWords {

    static String NumToWord(int num) {
        switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";

        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(NumToWord(5));
    }
}
