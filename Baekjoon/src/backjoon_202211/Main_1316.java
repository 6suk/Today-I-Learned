package backjoon_202211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_1316 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("happy");
		list.add("new");
		list.add("year");
		
		
		list.stream()
		.flatMap(data -> Arrays.stream(data.split(" "))
		.forEach(x -> System.out.println(x));
		
		System.out.println(count);
		
	}

}
