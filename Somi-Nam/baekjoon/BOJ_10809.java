package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10809
 */
public class BOJ_10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		String s = br.readLine();
		Integer[] charList = new Integer[] {
				-1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, 
				-1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1};
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int cInt = c - 'a';
			if(charList[cInt] == -1) {
				charList[cInt] = i;
			} else continue;
		}
		
		
		for (Integer integer : charList) {
			builder.append(integer).append(" ");
		}
		
		builder.delete(builder.length() - 1, builder.length());
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}

}
