package backjoon_202305;

import java.util.Arrays;
import java.util.Stack;

public class Pro_42586 {
    public int[] solution(int[] progresses, int[] speeds) {

        Stack<Integer> st = new Stack<>();
        // 첫번째 작업일 계산
        double tmp = Math.ceil((100.0 - progresses[0]) / speeds[0]); // day = (100 - progresses) / speeds
        int cnt = 1;

        // 이후 작업일 계산
        for (int i = 1; i < progresses.length; i++) {
            double date = Math.ceil((100.0 - progresses[i]) / speeds[i]);

            // 기준 작업일보다 적게 소요될 경우 카운트
            if (date <= tmp) {
                ++cnt;
                continue;
            }

            // 기준 작업일보다 늦게 소요될 경우 초기화, tmp 데이터 변경
            st.push(cnt);
            cnt = 1;
            tmp = date;
        }

        // 마지막 cnt 넣어주기
        st.push(cnt);
        return st.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
//        int[] arr = {95, 90, 99, 99, 80, 99};
//        int[] arrr = {1, 1, 1, 1, 1, 1};
        int[] arr = {93, 30, 55};
        int[] arrr = {1, 30, 5};

        System.out.println(Arrays.toString(new Pro_42586().solution(arr, arrr)));
    }
}
