package linearSearch;

public class Minimum {
    public static void main(String[] args)
    {
        int[] arr = {18, 12, 7, 3, 1, 28};
        System.out.println(min(arr));
    }
    //assume arr.length != 0
    //return the minimum value of the array

    static int min(int[] arr)
    {
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
}
