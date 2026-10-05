package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18 , 12 , -7 , 3 , 14, 28};
        int target = 3;
        System.out.println(linearSeach(arr, target, 1, 4));
    }

    static int linearSeach(int[] arr, int target, int start , int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        //run the loop
        for(int index = start ; index <= end ; index++)
        {
            //check here for element every index it is found the target or not
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }
        // this line weill execute if none of the return statement above executed
        //hence the target not found
        return -1;
    }
}
