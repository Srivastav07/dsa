package java_program;

public class Basic {
    public static void main(String[] args){
        int a = 10;
        if( a == 10 ){
            System.out.println("Hello World...");
        }
        int count = 1;
        while( count != 5){
            System.out.println(count);
            count++;
        }
        System.out.println("------------------------------");
        //for loop
        for(count = 1; count != 10 ; count++){
            System.out.println(count);
        }
    }
}
