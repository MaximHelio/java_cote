import java.util.Scanner;

public class Basic3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num:arr) {
            if(num % 2 == 1){
                num = num * 2;
            }
        }
        for (int num: arr) {
            System.out.println(num);
        }
    }
}
