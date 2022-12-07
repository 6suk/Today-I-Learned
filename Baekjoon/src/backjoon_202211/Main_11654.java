package backjoon_202211;

import java.io.*;
import java.text.DecimalFormat;

public class Main_11654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		char b = a.charAt(0);
		
		DecimalFormat df = new DecimalFormat("#");
		bw.write(df.format(b)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
