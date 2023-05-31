package cote_202305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pro_84728 {
    public int[] Solution(int[][] v) {
        int[] result = {0, 0};
        int cnt = 0;

        while (cnt < 2) {
            List<Integer> list = new ArrayList<>();

            for (int[] xy : v) {
                list.add(xy[cnt]);
            }

            List<Integer> disList = list.stream()
                    .distinct()
                    .collect(Collectors.toList());

            for (Integer a : disList) {
                list.remove(a);
            }

            disList.remove(list.get(0));
            result[cnt] = disList.get(0);
            cnt++;
        }

        return result;
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 4}, {3, 4}, {3, 10}};
        int[][] arr = {{1, 1}, {2, 2}, {1, 2}};
        System.out.println(Arrays.toString(new Pro_84728().Solution(arr)));
    }
}
