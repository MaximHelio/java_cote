import java.util.Scanner;

public class Basic2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째숫자: ");
        int num1 = sc.nextInt();
        System.out.print("두번째숫자: ");
        int num2 = sc.nextInt();
        for (int i = num1; i <num2 +1 ; i++) {
            System.out.print(i+" ");
        }
    }
}
