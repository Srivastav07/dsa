package methods;

public class Overloading {
    public static void main(String[] args) {
        //fun(67);
        //fun("Sri Prakash");
        int ans = sum(3, 4, 5);
        System.out.println(ans);
    }

     static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum(int a, int b) {
        return  a + b;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
