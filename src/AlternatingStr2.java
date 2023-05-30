import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingStr2 {

    public static String solution(String str1, String str2) {
        char[] str1_arr = str1.toCharArray();
        char[] str2_arr = str2.toCharArray();
        int cnt = str1.length();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            arrayList.add(str1_arr[i]);
            arrayList.add(str2_arr[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character element: arrayList) {
            stringBuilder.append(element);
        }
        String result = stringBuilder.toString();
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
