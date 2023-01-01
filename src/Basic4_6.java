import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Basic4_6 {
    public static void main(String[] args) throws IOException {
        Integer[] arr = {1, 3, 3, 2, 1, 1, 4, 5, 5, 1};
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

        System.out.println(set);

    }
}
