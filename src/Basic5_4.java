import java.util.Scanner;

public class Basic5_4 {
    public static int reverse(int num){
        String answer ="";
        String c = Integer.toString(num);
        for (int i = c.length()-1; i >= 0; i--) {
            answer += c.charAt(i);
        }
        int ans = Integer.parseInt(answer);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(reverse(num));
    }
}
