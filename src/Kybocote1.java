import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Kybocote1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 6
        int K = sc.nextInt(); // 4
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt(); // 1 2 3 1 1 1
        }
        int a = N / 3; // 2
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            int index = i;
            int sum = 0;
            sum += arr[3*index] + arr[3*index+1] + arr[3*index+2];
            if(sum >= K) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
