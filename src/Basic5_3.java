import java.util.Scanner;

public class Basic5_3 {

    public static int add(int num1, int num2){
        int result = 0;
        for (int i = num1; i < num2+1; i++) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(add(num1, num2));
    }
}
