package recursion.patterns;

public class Triange {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            triangle(row, col+1);
            System.out.print("*");
        }
        else {
            triangle(row-1, 0);
            System.out.println();
        }
    }

    static void triangle2(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row) {
            System.out.print("*");
            triangle2(row, col+1);
        } else {
            System.out.println();
            triangle2(row-1, 0);
        }
    }
}
