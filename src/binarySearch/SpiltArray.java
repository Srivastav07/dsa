package binarySearch;

public class SpiltArray {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        int result = splitArray(nums, m);

        System.out.println("Minimum largest sum = " + result);
    }
    static int splitArray(int[] nums , int m)
    {
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < nums.length; i++)
        {
            start  = Math.max(start,nums[i]); // in the end of the loop this will contain the max item of the array
            end += nums[i];
        }
        //binarySearch
        while (start < end)
        {
            int mid = start + (end - start) /2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums)
            {
                if(sum + num > mid)
                {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > m)
            {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; //here start == end
    }
}
