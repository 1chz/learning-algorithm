package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1009
 */
public class Main_1009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken()); // 4의 거듭제곱 반복
			b = (b % 4) == 0? (b % 4) + 4 : (b % 4);
			
			double data = Math.pow(a, b);
			int answer = (int) (data % 10);  // 마지막 자리수만 필요
			if(answer != 0){
				builder.append((int)(data%10)).append("\n");
			} else builder.append(10).append("\n"); // 10번째 컴퓨터
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
