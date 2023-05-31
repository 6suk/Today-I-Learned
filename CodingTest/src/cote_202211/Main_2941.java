package cote_202211;

import java.io.*;

public class Main_2941 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] strBox = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
			for(String a : strBox) {
				if(input.contains(a)) {
					input = input.replace(a, "a");
				}
			}
		System.out.println(input.length());
	}
}