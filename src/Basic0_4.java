import java.util.Scanner;

public class Basic0_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(arr[num-1]);
    }
}
