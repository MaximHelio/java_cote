import java.util.Arrays;
import java.util.Scanner;

public class Basic4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        // foreach로 넣으면 왜 안되는 거지?
//        for (int num :  arr) {  // int는 value type이라서 copy본이라 arr원본이 바뀌지 않음
//            num = sc.nextInt();
//        }
        for (int i = 0; i < 6; i++) { //
            arr[i] = sc.nextInt();
        }
        for (int i = 5; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
