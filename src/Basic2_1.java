import java.util.Scanner;

public class Basic2_1 {
    public static void main(String[] args) {
        int[] possible = {1, 7};
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            int index = (int)(Math.random()*2);
            arr[i] = possible[index];
        }
        String result = "";
//        for (int i = 0; i < 5; i++) {
//            if(arr[i] == 7 && arr[i+1]==7 && arr[i+2]==7){  // 7이 연속으로 3번이상 나오면
//                cnt++;
//            }
//        }
        int cnt = 0;
        for (int i = 0; i < 7; i++) {
            if(arr[i] == 1){
                cnt = 0;
            }else{ // 7이면
                cnt++;
                if(cnt >= 3) {
                    result = "당첨";
                    break;
                }
            }
        }
        if(cnt <3) {
            result = "꽝";
        }
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println(": " + result);
    }
}
