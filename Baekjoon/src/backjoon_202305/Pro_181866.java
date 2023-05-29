package backjoon_202305;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pro_181866 {
    public String[] solution(String myString) {

//        List<String> list = Arrays.stream(myString.split("x"))
//                .filter(x -> !x.equals(""))
//                .sorted()
//                .collect(Collectors.toList());
//
//        return list.toArray(new String[list.size()]);

        return Arrays.stream(myString.split("x"))
                .filter(x -> !x.equals(""))
                .sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String str = "dxccxbbbxxaaaa";
        System.out.println(Arrays.toString(new Pro_181866().solution(str)));
    }
}
