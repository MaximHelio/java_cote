import java.util.Scanner;

public class Basic0_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y != 0) {
            System.out.println("몫:" + x / y);
            if(x % y !=0){
                System.out.println("나머지:" + x % y);
            }
        }
    }
}
