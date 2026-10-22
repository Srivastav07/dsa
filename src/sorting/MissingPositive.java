package sorting;

public class MissingPositive {
    public static void main(String[] args)
    {
        int[] nums = {3, 4, -1, 1};

        int result = firstMissingPositive(nums);

        System.out.println("First Missing Positive: " + result);
    }
    static int firstMissingPositive(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //seaarch for first missing number
        for(int index = 0 ; index < arr.length; index++){
            if(arr[index] != index + 1)
            {
                return index + 1;
            }
        }
        //case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
