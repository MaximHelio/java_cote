import java.util.Scanner;

public class Basic2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자: ");
        int num = sc.nextInt();
        System.out.print("공차: ");
        int d = sc.nextInt();
        for (int i = num; i < num+ 9*d+1; i=i+d) {
            System.out.print(i+" ");
        }
    }
}
