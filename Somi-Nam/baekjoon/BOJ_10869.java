package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10869
 * @author ndanl
 */
public class BOJ_10869 {
	// A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(a + b).append("\n");
		builder.append(a - b).append("\n");
		builder.append(a * b).append("\n");
		builder.append(a / b).append("\n");
		builder.append(a % b);
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
	}
}
