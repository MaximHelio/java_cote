import java.util.Scanner;

public class Basic0_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        float max = arr[0];
        float sum = max;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
        System.out.println(max);
        sc.close();
    }
}
