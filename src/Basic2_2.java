import java.util.Scanner;

public class Basic2_2 {
    public static void main(String[] args) {
<<<<<<< HEAD
        // 1= 가위 2= 바위 3= 보
        System.out.println("가위(1) ,바위(2), 보(3) 중에 하나 선택하세요");
        int[] win = {0, 3, 1, 2};
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        // 컴퓨터
        int com = (int)Math.random() * 3 + 1;
        System.out.println(com);

        // 판단
        if(na == com){
            System.out.println("무승부");
        }else if(win[na] == com){
            System.out.println("승리");
        }else{
            System.out.println("패배");
        }





//        String[] arr = {"가위", "바위", "보"};
//        int[] win = {0, 3, 1, 2};
//        Scanner sc = new Scanner(System.in);
//        String na = sc.nextLine();
//        int na_index = 0;
//        for (int i = 0; i < 3; i++) {
//            if(na == arr[i]){
//                na_index = i;
//            }
//        }
//        int com = (int)(Math.random()*4);
//        for (int i = 0; i < 4; i++) {
//            if(com)
//        }
=======

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
>>>>>>> e5a2079f0f9cc93433bd9950de5a2415c71e9a12

    }
}
