import java.util.Arrays;
import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int cnt = 0;
        for (int num:arr) {
            if(num == v){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
