import java.util.Scanner;

public class Baekjoon10872 {
    public static int factorial(int N){
        if(N == 1) {
            return 1;
        }
        if(N==0){
            return 1;
        }
        return factorial(N - 1) * N;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }

}
