package linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,3,1},
                {1,5,3}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts)
    {
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for(int person = 0 ; person < accounts.length; person++)
        {
            //when you start a new row, take a new sum for that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++)
            {
                sum = sum + accounts[person][account];
            }
            // now we have sum of accounts of person
            //check eith overall ans
            if(sum > ans)
            {
                ans = sum;
            }
        }
        return ans;
    }
}
