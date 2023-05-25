package backjoon_202305;

import java.util.Arrays;

public class Pro_12944 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    public static void main(String[] args) {
        Pro_12944 test = new Pro_12944();
        double result = test.solution(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
