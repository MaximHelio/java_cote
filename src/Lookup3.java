public class Lookup3 {
    public static void main(String[] args) {
        int score = 5;
        String[] message = {
                "",
                "최고의 성적입니다. 축하합니다",
                "우수한 성적입니다",
                "보통입니다",
                "다소 부진합니다. 더 노력하세요",
                "왜 사니?",
        };
        int[] rank = {5, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1};
        System.out.println(rank[score]);
        System.out.println(message[rank[score]]);
    }
}
