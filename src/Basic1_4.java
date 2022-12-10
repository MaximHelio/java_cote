import java.util.Scanner;

public class Basic1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == -1){
                return;
            }
            for (int i = 1; i < 10; i++) {
                System.out.println(n+"*"+i+"="+(n*i));
            }
        }
    }
}
