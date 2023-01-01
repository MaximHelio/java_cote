import java.util.Arrays;

public class Basic4_7 {
    public static int[][] transpose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] trans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(i == j){
                    trans[i][j] = arr[i][j];
                }
                else{
                    trans[i][j] = arr[j][i];
                }
            }
        }
        return trans;
    }
    public static String verticalFlip(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] vf = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                vf[i][j] = arr[i][col-1-j];
            }
        }

        String answer = Arrays.deepToString(vf);
        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        System.out.println(verticalFlip(transpose(arr)));
    }
}
