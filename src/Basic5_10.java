import java.util.Scanner;

public class Basic5_10 {
    public static int gcd(int a, int b){
        int rule = Math.min(a,b);
        for (int i = rule; i >= 0; i--) {
            if(b % i == 0 && a % i ==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
    }
}
