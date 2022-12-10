package backjoon_202212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        br.close();

        List<Integer> list = Arrays.stream(str).mapToInt(x->Integer.parseInt(x))
                .distinct().sorted()
                .boxed().collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(str[i]);
            int x = list.indexOf(tmp);
            sb.append(x).append(" ");
        }
        System.out.println(sb);

    }
}
