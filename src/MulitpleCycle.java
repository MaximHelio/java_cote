import java.util.Scanner;

public class MulitpleCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int cnt = 0;
        int temp = N;

        while (true){
            cnt++;
            N = (N%10)*10 + (N/10 + N%10)%10;
            if(N == temp){
                break;
            }
        }
        System.out.println(cnt);
    }
}
