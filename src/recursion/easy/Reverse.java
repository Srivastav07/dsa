package recursion.easy;

public class Reverse {
    static int sum = 0;
    public static void main(String[] args) {
        //System.out.println(reverse2(12345));
        reverse(67089);
        System.out.println(sum);
    }

    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

    static int reverse2(int n){
        //sometimes you might need some addtional variables in the argument
        //int that case, make another function

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if(n%10 == 0){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits -1)) + helper(n/10, digits-1);
    }

}
