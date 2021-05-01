package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/4641">
 * https://www.acmicpc.net/problem/4641 Doubles
 * </a>
 */
public class BOJ_4641 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		int[] number;
		while(true) {
			String read = br.readLine().trim();
			if(read.equals("-1")) break;
			
			number = new int[101]; // 0 ~ 100
			StringTokenizer token = new StringTokenizer(read, " ");
			while(token.hasMoreTokens()) {
				number[Integer.parseInt(token.nextToken())]++;
			}

			int cnt = 0;
			for (int i = 1; i < 51; i++) {
				if(number[i] == 1 && number[2*i] == 1) {
					cnt++;
				}
			}
			builder.append(cnt).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}

}
