import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 매번 생성할 필요x
        while(true){
            int N = sc.nextInt();
            if (N == 99999) {
                break;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N-i; j++) {
                    System.out.print(" ");
                }
                for (int j = N-i-1; j < N; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
}
    }
