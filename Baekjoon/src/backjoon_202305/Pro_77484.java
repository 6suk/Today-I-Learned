package backjoon_202305;

import java.util.Arrays;

/*로또의 최고 순위와 최저 순위*/

public class Pro_77484 {

    // 제출 1 (통과)
    public int[] solution1(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int zeroCnt = 0;


        for (int num : lottos) {
            for (int win : win_nums) {
                if (num == win) ++cnt;
            }
            if (num == 0) ++zeroCnt;
        }

        int max = cnt + zeroCnt == 0 ? 6 : 7 - (cnt + zeroCnt);
        int min = cnt == 0 ? 6 : 7 - cnt;

        return new int[]{max, min};
    }

    // 제출 2 (통과)
    public int[] solution(int[] lottos, int[] win_nums) {
        int max = 7, min = 7;
        for (int a : lottos) {
            int tmp = (int) Arrays.stream(win_nums).filter(x -> x == a).count();
            min -= tmp;
            max -= tmp;
            if (a == 0) max--;
        }
        return new int[]{Math.min(max, 6), Math.min(min, 6)};
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 0};
        int[] b = {38, 19, 20, 40, 15, 25};

        System.out.println(Arrays.toString(new Pro_77484().solution(a, b)));
    }
}
