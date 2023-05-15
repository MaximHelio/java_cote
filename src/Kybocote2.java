import java.util.Scanner;

public class Kybocote2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = Long.valueOf(sc.next()); // 세로
        Long M = Long.valueOf(sc.next()); // 세로
        int K = sc.nextInt(); // 개수
        Long[][] arr = new Long[K][K];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                arr[i][j] = (long) sc.nextInt();
            }
        }
        System.out.println();
        // 넓이 값 비교
        Long[] garo = new Long[K+2];
        Long[] sero = new Long[K+2];
        garo[0] = 0L;
        sero[0] = 0L;

        garo[K+1] = M; // 7
        sero[K+1] = N; // 5
        for (int i = 1; i < K+1; i++) {
            // 가로
            garo[i] = arr[i-1][0];
            // 세로
            sero[i] = arr[i-1][1];
        }

        int[] modiGaro = new int[K+1];
        int[] modiSero = new int[K+1];

        for (int i = 0; i < K+1; i++) {
            modiGaro[i] = (int) (garo[i+1] - garo[i]);
            modiSero[i] = (int) (sero[i+1] - sero[i]);
        }

        int minGaro = modiGaro[0];
        int maxGaro = modiGaro[0];
        int minSero = modiSero[0];
        int maxSero = modiSero[0];
        for (int i = 0; i < K+1; i++) {
            if (minGaro > modiGaro[i]) {
                minGaro = modiGaro[i];
            }
            if (maxGaro <= modiGaro[i]) {
                maxGaro = modiGaro[i];
            }
            if (minSero > modiSero[i]) {
                minSero = modiSero[i];
            }
            if (maxSero <= modiSero[i]) {
                maxSero = modiSero[i];
            }
        }

        System.out.print(minGaro * minSero);
        System.out.print(' ');
        System.out.print(maxGaro * maxSero);
    }

}

//
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt(); // 세로
//        int M = sc.nextInt(); // 가로
//        int K = sc.nextInt(); // 개수
//        int[][] arr = new int[K][K];
//        for (int i = 0; i < K; i++) {
//            for (int j = 0; j < K; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println();
//        // 넓이 값 비교
//        int[] square = new int[(K+1)*(K+1)];
//        int[] garo = new int[K+2];
//        int[] sero = new int[K+2];
//        garo[0] = 0;
//        sero[0] = 0;
//
//        garo[K+1] = M; // 7
//        sero[K+1] = N; // 5
//        for (int i = 1; i < K+1; i++) {
//            // 가로
//            garo[i] = arr[i-1][0];
//            // 세로
//            sero[i] = arr[i-1][1];
//        }
//
//        int[] modiGaro = new int[K+1];
//        int[] modiSero = new int[K+1];
//
//        for (int i = 0; i < K+1; i++) {
//            modiGaro[i] = garo[i+1] - garo[i];
//            modiSero[i] = sero[i+1] - sero[i];
//        }
//
//        int minGaro = modiGaro[0];
//        int maxGaro = modiGaro[0];
//        int minSero = modiSero[0];
//        int maxSero = modiSero[0];
//        for (int i = 0; i < K+1; i++) {
//            if (minGaro > modiGaro[i]) {
//                minGaro = modiGaro[i];
//            }
//            if (maxGaro <= modiGaro[i]) {
//                maxGaro = modiGaro[i];
//            }
//            if (minSero > modiSero[i]) {
//                minSero = modiSero[i];
//            }
//            if (maxSero <= modiSero[i]) {
//                maxSero = modiSero[i];
//            }
//        }
//
//        System.out.print(minGaro * minSero);
//        System.out.print(' ');
//        System.out.print(maxGaro * maxSero);
//    }
//}