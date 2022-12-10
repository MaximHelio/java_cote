import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            int num = Integer.parseInt(s);
//            if(num != num+2){
//                return;
//            }
            int daum = num+1;
            String s_daum = Integer.toString(daum);
            for (int i = 0; i < s_daum.length(); i++) {
                if(s_daum.charAt(i) == '3' || s_daum.charAt(i) == '6' || s_daum.charAt(i) == '9'){
                    System.out.println("짝");
                }else{
                    System.out.println(daum);
                }
            }
        }

    }
}