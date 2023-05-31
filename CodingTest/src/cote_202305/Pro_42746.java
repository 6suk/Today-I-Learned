package cote_202305;

import java.util.Arrays;

/*
 * [가장 큰 수]
 * Comparator 문제 -> 노션 정리 완료 -> 나중에 다시 한번 풀어보기
 *
 * */

public class Pro_42746 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // ("9"+"5").compareTo("5"+"9") > 95.compareTo(59)
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 모두 0일 때,
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] num = {0, 0, 0};
        System.out.println(new Pro_42746().solution(num));
    }
}
