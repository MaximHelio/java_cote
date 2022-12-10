import java.util.HashMap;
import java.util.Scanner;

public class Basic0_6 {
//    public static String sum(int[] nums, int target){
//        String result="";
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j <nums.length; j++) {
//                if(nums[i] + nums[j] == target){
//                    result =  "["+ i + "," + j + "]";
//                    return result;
//                }
//            }
//        }
//        return "";
//    }
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1  = {11, 2, 15, 7};
        int[] arr2  = {3, 2, 4};
        int[] arr3  = {3, 3};

        System.out.println("[" + sum(arr1, 9) + "]");
        System.out.println("[" + sum(arr2, 6) + "]");
        System.out.println("[" + sum(arr3, 6) + "]");
    }
    public static String sum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i]; // 9 - 11
            if(hm.containsKey(pair)){ // 있으면, 자바 배열
                return i +","+ hm.get(pair);
            }
        }
        return "";
    }
}
