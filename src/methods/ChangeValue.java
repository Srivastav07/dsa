package methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 6};
        channge(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void channge(int[] nums) {
        nums[0] = 99; //if you make a change to the object via this refrence variable,same object will be changed
    }
}
