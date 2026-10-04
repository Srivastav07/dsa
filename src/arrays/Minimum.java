package arrays;

public class Minimum {
    public static void main(String[] args){
        int[] arr = {1 , 3, 5, 6, 8, 9,18};
        System.out.println(minRange(arr , 1, 3));
        System.out.println(min(arr));
    }
    //work on edge cases here, like array being null
    static int minRange(int[] arr, int start, int end) {
        if(start > end)
        {
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int minValue = arr[start];
        for (int i = start; i <= end ; i++)
        {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    static int min(int[] arr) {
        if(arr.length == 0)
        {
            return -1;
        }
        int minVal = arr[0];
        for (int i = 1 ; i < arr.length; i++)
        {
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
