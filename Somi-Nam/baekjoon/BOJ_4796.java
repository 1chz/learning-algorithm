package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/4796">
 * https://www.acmicpc.net/problem/4796 캠핑
 * </a>
 */
public class BOJ_4796 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		
		int cnt = 1;
		do {
			String read = br.readLine();
			if(read.equalsIgnoreCase("0 0 0")) break;
			
			int day = 0;
			
			StringTokenizer token = new StringTokenizer(read, " ");
			int L = Integer.parseInt(token.nextToken());
			int P = Integer.parseInt(token.nextToken()); // 연속하는 P일 중 L일만 사용가능
			int V = Integer.parseInt(token.nextToken()); // 휴가 일수
			
			// 1. 연속하는 P일을 이용할 수 있는 몫
			int share = (V / P);
			int remain = (V % P);
			day += L * share;
			day += (remain >= L) ? L : remain;
			
			builder.append("Case ").append(cnt++).append(": ").append(day).append("\n");
		} while (true);
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
