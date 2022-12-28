import java.util.Scanner;

public class Basic2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("가위:1, 바위:2, 보:3 중에 하나를 입력하세요");
        int na = sc.nextInt();

        // 컴퓨터
        int com = (int)(Math.random()*3);
        if(com == 1){
            System.out.println("컴퓨터: 가위");
        }
        if(com == 2){
            System.out.println("컴퓨터: 바위");
        }
        if(com == 3){
            System.out.println("컴퓨터: 보");
        }

        // 결과
        int[] win = {0, 3, 1, 2};
        if(win[na] == com){
            System.out.println("승리");
        } else if (na == com) {
            System.out.println("무승부");
        } else{
            System.out.println("패배");
        }

    }
}
