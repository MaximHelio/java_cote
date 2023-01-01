import java.util.Scanner;

public class Basic5_1 {
//    public static String inspect(int arg){
//        String answer;
//        if(arg % 2 ==0){
//            answer = "짝수입니다";
//        }else{
//            answer = "홀수입니다";
//        }
//        return answer;
//    }
    public static Boolean isEven(int arg){
        if(arg % 2 !=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
}
