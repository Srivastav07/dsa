package linearSearch;

public class Main {
    public static void main(String[] args)
    {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28, 56};
        int target = 16;
        System.out.println(linearSearch(nums, target));
        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));

    }
    //search the target and return the true or false
    static boolean linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return false;
        }
        //this is for each loop
        for(int element : arr)
        {
            if(element == target)
            {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    static int linearSearch2(int[] arr , int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int element : arr)
        {
            if(element == target)
            {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;

    }

    static int linearSearch3(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        //for loop
        for(int index = 0 ; index < arr.length ; index++)
        {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }


}
