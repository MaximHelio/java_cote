public class Gugu {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // 행
            for (int j = 1; j <= 9; j++) { // 열
                for (int k = i; k < i+3; k=k+3) { // 3씩 자르기
                    System.out.println(i + "x" + j + "=" + i * j + " ");
                }
            }
            System.out.println();
        }
    }
}
