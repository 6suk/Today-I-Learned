package backjoon_202305;

import java.util.Arrays;

public class Pro_42577 {
    // 1차 제출 (실패)
    public boolean solution1(String[] phone_book) {
        String tmp = phone_book[0];

        for (int i = 1; i < phone_book.length; i++) {
            String x = phone_book[i].substring(0, tmp.length());
            if (tmp.equals(x)) return false;
            if (i == phone_book.length - 1) tmp = phone_book[i];
        }

        return true;
    }

    // 2차 제출 (통과)
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }

        return true;
    }




    public static void main(String[] args) {
        String[] pb = {"12", "123", "1235", "567", "88", "1234"};
        System.out.println(new Pro_42577().solution(pb));
    }
}
