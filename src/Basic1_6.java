import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Basic1_6 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int turn = 1;
        while(true){
            String answer = Integer.toString(turn);

            for (int i = 0; i < answer.length(); i++) {
                if( answer.charAt(i) == '3'
                || answer.charAt(i) == '6'
                || answer.charAt(i) == '9') {
                    answer = "짝";
                    break;
                }
            }

            String input = sc.next();

            if ( answer.equals(input) == false )
            {
                break;
            }
            turn++;
        }

    }
}