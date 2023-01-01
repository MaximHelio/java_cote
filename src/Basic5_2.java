import java.util.Scanner;

public class Basic5_2 {
    public static double divide(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        System.out.println(divide(num1, num2));
    }
}
