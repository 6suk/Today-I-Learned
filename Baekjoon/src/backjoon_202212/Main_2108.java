package backjoon_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
 * 둘째 줄에는 중앙값을 출력한다.
 * 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
 * 넷째 줄에는 범위를 출력한다.
 * <p>
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */


public class Main_2108 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numBox = new int[n];

        for (int i = 0; i < n; i++) numBox[i] = Integer.parseInt(br.readLine());
        br.close();
        Arrays.sort(numBox);

        if (n == 1) {
            int tmp = numBox[0];
            System.out.printf("%d\n%d\n%d\n0", tmp, tmp, tmp);
        } else {
            int max = Arrays.stream(numBox).max().getAsInt();
            int min = Arrays.stream(numBox).min().getAsInt();
            System.out.println(getAvg(numBox));
            System.out.println(getMiddle(numBox, n));
            System.out.println(getMoreVal(numBox));
            System.out.println(max - min);
        }

    }

    //중앙값
    public static int getMiddle(int[] numBox, int n) {
        return numBox[n / 2];
    }

    //산술평균
    public static int getAvg(int[] numBox) {
        double avg = Arrays.stream(numBox).average().getAsDouble();
        return (int) Math.round(avg);
    }

    public static int getMoreVal(int[] numBox) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : numBox) {
            map.merge(a, 1, Integer::sum);
        }

        Map.Entry<Integer, Integer> max = map.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);


        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            if (a.getValue() == max.getValue()) {
                list.add(a.getKey());
            }
        }
        if (list.size() > 1) {
            list.sort(Comparator.comparingInt(x -> x));
            return list.get(1);
        } else {
            return max.getKey();
        }

    }

}
