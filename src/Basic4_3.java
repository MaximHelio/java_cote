import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Basic4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        List<Integer> oddList = new ArrayList<>();
//        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0 ){
                System.out.print( arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 !=0 ){
                System.out.print( arr[i] + " ");
            }
        }
//        for (int i = 0; i < oddList.size(); i++) {
//            System.out.print(oddList.get(i) + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < evenList.size(); i++) {
//            System.out.print(evenList.get(i) + " ");
//        }

    }
}
