import java.util.Scanner;

public class Basic4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();      // 1 3 5 7 10 15
        }
        int num = sc.nextInt();         // 11

        int rule = 0;
        for (int i = 0; i < 5; i++) {
            if(num < arr[0]){
                rule = 0;
            }
            if(arr[i]< num && num < arr[i+1]){
                rule = i+1;
            }
            if(num > arr[5]){
                rule = 6;
            }
        }
        if(rule < 6){
            for (int i = 5; i >= rule; i--) {
                arr[i+1] =arr[i];
            }
        }
        arr[rule] = num;
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
