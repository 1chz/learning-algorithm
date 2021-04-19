package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/11721
 */
public class BOJ_11721 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String read = br.readLine();
		StringBuilder builder =  new StringBuilder();
		
		if(read.length() <= 10) {
			builder.append(read);
		} else 
			for (int i = 0; i <= (read.length() / 10); i++) {
				try {
					builder.append(read.subSequence(10*i, 10*(i+1))).append("\n");
				} catch (StringIndexOutOfBoundsException e) {
					builder.append(read.subSequence(10*i, read.length())).append("\n");
				}
			}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
