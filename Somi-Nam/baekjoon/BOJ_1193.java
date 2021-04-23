package baekjoon;

import java.io.*;
/**
 * @author NSM
 * https://www.acmicpc.net/problem/1193
 */
public class BOJ_1193 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		int x = Integer.parseInt(br.readLine());
		if(x == 1) {
			builder.append("1/1");
		} else for (int i = 1; i <= x; i++) {
			int sum = (i+1) * i / 2;
			int nextSum = ((i+1)+1) * (i+1) / 2;
			if(sum <= x && x <= nextSum) {
				// i+1번째까지의 합에 이 순서가 들어있음
				int cnt = x - sum;
				if(i % 2 == 0)
					builder.append((i + 1) - cnt + 1).append("/").append(cnt);
				else
					builder.append(cnt).append("/").append((i + 1) - cnt + 1);
				break;
			}
		}
		
		bw.write(builder.toString());
		bw.close();
		br.close();
	}
}
