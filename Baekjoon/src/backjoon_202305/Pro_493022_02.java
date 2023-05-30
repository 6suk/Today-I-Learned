package backjoon_202305;

public class Pro_493022_02 {
    public String solution(int n) {
        String[] arr = {"4", "1", "2"};
        String result = "";
        int rest = 0;

        while (n > 0) {
            rest = n % 3; n = n / 3;
            if(rest == 0) n = n - 1;
            result = arr[rest] + result;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(new Pro_493022_02().solution(n));
    }
}
