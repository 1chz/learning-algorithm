package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/2675">
 * https://www.acmicpc.net/problem/2675 문자열 반복
 * </a>
 */
public class BOJ_2675 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(token.nextToken());
				
			String s = token.nextToken();
			for (int j = 0; j < s.length(); j++) {
				builder.append(Character.toString(s.charAt(j)).repeat(R));
			}
			builder.append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
