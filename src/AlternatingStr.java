import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingStr {
    public static String solution(String str1, String str2){

        String answer = "";
        int length = str1.length();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i = 0; i < length; i++) {
            answer += str1arr[i] + str2arr[i];
        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
