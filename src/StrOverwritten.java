import java.util.Arrays;
import java.util.Scanner;

public class StrOverwritten {
    public static String solution(String myString, String overwriteString, int s) {
        int len = overwriteString.length();
        char[] myString_arr = myString.toCharArray();
        char[] overwriteString_arr = overwriteString.toCharArray();
        for (int i = 0; i < len; i++) {
            myString_arr[s+i] = overwriteString_arr[i];
        }
        String result = new String(myString_arr);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();
        System.out.println(solution(my_string, overwrite_string, s));
    }
}
