import java.util.Scanner;

public class Basic5_9 {
    public static int factor(int num){
        for (int i = num/2; i >0; i--) {  // 1, 3 ,5, 15
             if(num % i == 0){
                 return i;
             }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factor(num));
    }
}
