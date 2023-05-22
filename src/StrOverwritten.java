import java.util.Scanner;

public class StrOverwritten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        char[] my_string_arr = new char[my_string.length()];
        char[] overwrite_string_arr = new char[overwrite_string.length()];
//        for (int i = 0; i < overwrite_string.length(); i++) {
//            my_string_arr[s+i] = overwrite_string_arr[i];
//        }
        for (int i = 0; i < my_string.length(); i++) {
            System.out.println(my_string_arr[i]);
        }
    }
}
