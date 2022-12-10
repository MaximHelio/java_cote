import java.util.Scanner;

public class Basic2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int score = sc.nextInt();
            if(score >=91 && score<=100){
                System.out.println("A");
                return;
            } else if (score>=81 && score<=90) {
                System.out.println("B");
                return;
            } else if (score >= 71 && score<=80) {
                System.out.println("C");
                return;
            } else if (score>=61&& score<=70) {
                System.out.println("D");
                return;
            } else if (score>=0 && score<=60) {
                System.out.println("F");
                return;
            }else{
                System.out.println("다시 입력하세요");
            }
        }
    }
}
