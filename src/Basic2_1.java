import java.util.Random;

public class Basic2_1 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
