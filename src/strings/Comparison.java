package strings;

public class Comparison {
    public static  void main(String[] args){
        String a = "Prakash";
        String b = "Prakash";
        String c = a;

        System.out.println( c == a);
        System.out.println(a == b);

        String name1 = new String("Prakash");
        String name2 = new String("Prakash");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
