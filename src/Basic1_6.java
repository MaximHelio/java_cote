import java.util.Scanner;

public class Basic1_6 {
    public static void main(String[] args) {
        int[] possible = {1, 7};
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            int index = (int)(Math.random()*2);
            arr[i] = possible[index];
        }
        String result = "";
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            if(arr[i] == 7 && arr[i+1]==7 && arr[i+2]==7){
                 cnt++;
            }
        }
        if(cnt > 0) {
            result = "당첨";
        }else{
            result = "꽝";
        }
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println(": " + result);
    }
}
