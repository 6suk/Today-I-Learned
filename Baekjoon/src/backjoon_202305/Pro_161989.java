package backjoon_202305;

public class Pro_161989 {
    public int solution(int n, int m, int[] section) {
        int fill = 1, result = 1;

        for (int i = 0; i < section.length - 1; i++) {
            int fill_m = section[i + 1] - section[i];
            fill += fill_m;

            if (fill > m) {
                result++;
                fill = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 8, m = 4;
        int[] section = {2, 3, 6};
        System.out.println(new Pro_161989().solution(n, m, section));
    }
}
