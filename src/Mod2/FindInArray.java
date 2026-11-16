package Mod2;

public class FindInArray {

    static int Biggest(int[] arr){
        int biggest = 0;
        int biggestIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > biggest){
                biggest = arr[i];
                biggestIndex = i;
            }
        }
        int[] res = { biggest, biggestIndex };
        return  biggest ;}
    public static void main(){
        int[] nums = {100, 1, 4, 15, 125, 35, 450};
        System.out.println(Biggest(nums));
        }
    }

