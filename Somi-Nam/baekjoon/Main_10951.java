package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10951
 */
public class Main_10951 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		while(true) {
			String read = br.readLine();
			if(read == null) break;
			int a = Integer.parseInt(read.substring(0, read.indexOf(" ")));
			int b = Integer.parseInt(read.substring(read.indexOf(" ") + 1, read.length()));
			builder.append(a+b).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
