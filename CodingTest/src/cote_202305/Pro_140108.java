package cote_202305;

public class Pro_140108 {
    public int solution(String s) {

        String x = "";
        int cnt = 0, non = 0;
        int result = 0;

        for(String str : s.split("")){
            if(x.equals("")){
                x = str;
                cnt++;
                result++;
            } else if(x.equals(str)){
                cnt++;
            }else {
                non++;
            }

            if(cnt == non){
                x = "";
                cnt = 0; non = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abracadabra";
        System.out.println(new Pro_140108().solution(str));
    }
}
