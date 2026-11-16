package Mod2;

public class AddWholeNum
{
    static Integer AddWholeNumbers(int start, int end){
        int result = start;
        for(int i = start; i <= end; i++){

            System.out.println(result + " + " + i + " = " +( result += i));
        }
        return result;
    }

    public static void main()
    {
        System.out.println(AddWholeNumbers(50,100));
    }
}
