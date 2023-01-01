import java.util.Scanner;

public class Basic4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int cnt = 0;
        for (int i:arr) {
            if(i == num){
                cnt +=1;
            }
        }
        System.out.println(cnt);
    }
}
