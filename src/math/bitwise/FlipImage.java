package math.bitwise;

import java.util.Arrays;

public class FlipImage {
    public int[][] flipAndInverImage(int[][] image){
        for(int[] row : image){
            for(int i = 0; i < (image[0].length + 1) / 2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
    public static void main(String[] args){
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        FlipImage obj = new FlipImage();
        int[][] result = obj.flipAndInverImage(image);

        for(int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }
}
