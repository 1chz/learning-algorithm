package baekjoon;

import java.io.*;
import java.util.Arrays;
/**
 * @see <a href="https://www.acmicpc.net/problem/2750">
 * https://www.acmicpc.net/problem/2750 수 정렬하기
 * </a>
 */
public class BOJ_2750 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		// 1. Arrays.sort 방법
		Arrays.sort(array);
		StringBuilder builder = new StringBuilder();
		for (int i : array) {
			builder.append(i).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
	}
	
}
