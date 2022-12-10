import java.util.Scanner;

public class Basic0_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if( num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sc.close();
                return;
            }
        }
    }
}
