package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10430
 */
public class Main_10430 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		
		StringBuilder builder = new StringBuilder();
		
		builder.append((a+b)%c).append("\n");
		builder.append(((a%c) + (b%c))%c).append("\n");
		builder.append((a*b)%c).append("\n");
		builder.append(((a%c) * (b%c))%c).append("\n");
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
