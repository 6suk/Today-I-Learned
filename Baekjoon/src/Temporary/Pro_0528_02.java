package Temporary;

import java.util.Arrays;

public class Pro_0528_02 {
    public int solution(String s) {
        String[] arr = s.split(" ");

        String prev = "";
        int cnt = 1;

        for (int i = 0; i < arr.length; i++) {
            String page = arr[i];
            if (page.equals("B")) {
                System.out.println(cnt);
                prev = "B";
                arr[i] = i - (cnt * 2) >= 0 ? arr[i - (cnt * 2)] : "x";
                cnt++;
                continue;
            }

            if (page.equals("F")) {
                if (prev.equals("B")) {
                    prev = "F";
                    arr[i] = arr[i - 2];
                } else {
                    prev = "F";
                    arr[i] = "x";
                }
                continue;
            }

            prev = "num";
            cnt = 1;
        }

        System.out.println(Arrays.toString(arr));

        return 0;
    }

    public static void main(String[] args) {
//        String str = "1 2 3 4 B B 42 B F F";
        String str = "1 10 B B 20 1 F B B";
        System.out.println(new Pro_0528_02().solution(str));
    }
}
