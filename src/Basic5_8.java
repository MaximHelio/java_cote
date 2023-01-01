import java.util.Scanner;

public class Basic5_8 {
    public static String trans(String c){
        if(c.toLowerCase() != c){
            return c.toLowerCase();
        }else{
            return c.toUpperCase();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        System.out.println(trans(c));
    }
}
