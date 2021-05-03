package baekjoon;

import java.io.*;

public class BOJ_2455 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int current = 0; // 현재 인원
		for (int i = 0; i < 4; i++) {
			String read = br.readLine();
			int out = Integer.parseInt(read.substring(0, read.indexOf(" ")));
			int in = Integer.parseInt(read.substring(read.indexOf(" ")).trim());
			
			current = current - out + in;
			max = Math.max(max, current);
		}
		br.close();
		
		System.out.println(max);
	}
}
