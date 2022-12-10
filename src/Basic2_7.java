import java.util.Scanner;

public class Basic2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if(word == word.toLowerCase()){
            System.out.println("소문자입니다");
        }else{
            System.out.println("대문자입니다.");
        }

    }
}
