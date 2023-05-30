package backjoon_202305;

public class Pro_493022 {
    public String solution(int n) {
        String[] arr = {"4", "1", "2"};
        StringBuilder result = new StringBuilder();
        int div = n / 3, rest = n % 3;
        if (rest == 0) div = div - 1;

        result.append(arr[rest]);

        while (div >= 3) {
            rest = div % 3;
            div = div / 3;
            if (rest == 0) div = div - 1;
            result.append(arr[rest]);
        }

        if (n > 3 && div != 0) {
            result.append(arr[div]);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(new Pro_493022().solution(n));
    }
}
