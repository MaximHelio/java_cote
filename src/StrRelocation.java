import java.util.Scanner;

public class StrRelocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(str.indexOf(i)));
        }
    }
}