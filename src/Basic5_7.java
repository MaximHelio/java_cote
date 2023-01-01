import java.util.Scanner;

public class Basic5_7 {
    public static int smallest(int num1, int num2, int num3){

        return Math.min(Math.min(num1, num2), num3);

        //        int[] arr = {num1, num2, num3};
        //        int min = num1;
//        for (int num:arr) {
//            if(min > num){
//                min = num;
//            }
//        }
//        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(smallest(num1, num2, num3));
    }
}
