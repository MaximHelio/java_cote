import java.util.Arrays;

public class Basic4_1 {
    public static String multiply(int[][] a, int[][]b){
        int[][] result = new int[2][2];
        result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];

        String answer = Arrays.deepToString(result);
        return answer;
    }
    public static void main(String[] args) {
        int[][] a = {
                {3, 2},
                {1, 4}
        };
        int[][] b = {
                {9, 2},
                {1, 7}
        };

        System.out.println(multiply(a, b));
    }
}
