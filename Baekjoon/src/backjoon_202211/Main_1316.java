package backjoon_202211;

import java.util.*;

public class Main_1316 {

	public static void main(String[] args) {
		int[] tmp = new int[26];

		String s1 = "abcabc";
		String s2 = "new";
		String s3 = "year";
		String[] str = s1.split("");
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < s1.length(); i++) {
			tmp[s1.charAt(i)-97] += 1;
			if(tmp[s1.charAt(i)-97] > 1) {
				list.add(String.valueOf(s1.charAt(i)));
			}
		}
		
		list.forEach(x -> System.out.println(x));
		
		int cnt = 0;
		int result = 0;
		int result2 = 0;
		int startIndex = 0;
		
		for(int a : tmp) {
			if(a > 1) {
				String s = String.valueOf((char)(cnt+97));
				startIndex = Arrays.binarySearch(str, s);
				result = cnt;
				result2 = a;
			}
			cnt++;
		}
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += (startIndex+i);
		}
		
		System.out.println(startIndex);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(Arrays.toString(tmp));
		

	}
	


}
