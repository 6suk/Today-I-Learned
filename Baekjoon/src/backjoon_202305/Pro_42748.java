package backjoon_202305;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Pro_42748 {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> arr = Arrays.stream(array).boxed().collect(Collectors.toList());
        Stack<Integer> result = new Stack<>();

        for (int[] ijk : commands) {
            int i = ijk[0] - 1;
            int j = ijk[1];
            int k = ijk[2] - 1;
            List<Integer> reArr = arr.subList(i, j).stream()
                    .sorted().collect(Collectors.toList());
            result.push(reArr.get(k));
        }

        return result.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(new Pro_42748().solution(arr, com)));

    }
}
