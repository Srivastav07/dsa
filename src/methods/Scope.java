package methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Prakash";

        {
            // int a = 78;// already intialised outside the block in the same method, hence you cannot initise again
            a = 100; //reassign the origin refrence variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Ankit";
            System.out.println(name);
            //values intialised in this block, we will remain in block
        }

        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); //cannot use outside the block

        //scoping in loops
        for(int i = 0; i < 5 ; i++)
        {
            System.out.println(i);
            int num = 90;
            a = 100000;
        }
        System.out.println();
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
