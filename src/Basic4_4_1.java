import java.util.*;

public class Basic4_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // 1 3 5 7 10 15
        }
        int num = sc.nextInt();     // 11
        List<Integer> list = new ArrayList<>();

        for (int i: arr) {
            list.add(i);
        }
        list.add(num);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
