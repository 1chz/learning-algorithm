package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1008
 * @author ndanl
 */
public class BOJ_1008 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		
		double answer = (double) a / b;
		System.out.println(answer);
	}	
}
