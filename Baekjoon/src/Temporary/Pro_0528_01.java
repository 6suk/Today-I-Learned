package Temporary;

import java.util.Arrays;
import java.util.HashMap;

public class Pro_0528_01 {
    public int[] solution(int[][] v) {
        int[] result = {0, 0};
        int index = 0;

        while (index < 2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int[] xy : v) {
                map.put(xy[index], map.getOrDefault(xy[index], 0) + 1);
            }

            for (Integer key : map.keySet()) {
                if (map.get(key) == 1) result[index++] = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {3, 4}, {3, 10}};
//        int[][] arr = {{1, 1}, {2, 2}, {1, 2}};
        System.out.println(Arrays.toString(new Pro_0528_01().solution(arr)));
    }


}
