package cote_202306;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/155652
a = 97 ~ z = 122 / a ~ z : 26ea
 */

public class Date_0601_06 {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();

        // 한글자씩 해독
        for (char pw : s.toCharArray()) {
            int cnt = index;
            char decoding = '0';

            // skip 단어를 찾기 위해 for문
            for (int i = 1; i <= cnt; i++) {
                decoding = (char) (pw + i);

                if (decoding > 122) {   // 'z'를 넘어갈 경우 'a'부터
                    decoding = (char) ((decoding - 123) % 26 + 'a');
                    // decoding의 크기가 커져도 단어 26안에서 돌 수 있도록
                    // [반례] s = 'z' / skip = 'abcdefghij' / index = 20
                }

                for (char skipStr : skip.toCharArray()) {
                    if (decoding == skipStr) {
                        cnt++; //skip 단어가 있을 경우 index + 1
                    }
                }
            }
            result.append(decoding);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println(new Date_0601_06().solution(s, skip, index));
    }
}
