package cote_202305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 배열 원소의 길이
 */
public class Solution_0525_02 {
    public int[] solution(String[] strlist) {
        List<Integer> tmpList = new ArrayList<>();

        for (String s : strlist) {
            tmpList.add(s.length());
        }

        return tmpList.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        Solution_0525_02 play = new Solution_0525_02();
        String[] arr = {"We", "are", "the", "world!"};
        int[] result = play.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
