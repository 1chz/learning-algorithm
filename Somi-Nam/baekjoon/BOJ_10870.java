package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/10870">
 * https://www.acmicpc.net/problem/10870 피보나치 수 5
 * </a>
 */
public class BOJ_10870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int[] value = new int[21];
		System.out.println(pivonachi(value, n));
	}
	
	private static int pivonachi(int[] value, int num) {
		if(num == 1 || num == 0) {
			return num;
		}
		value[num] = pivonachi(value, num - 1) + pivonachi(value, num - 2);
		return value[num];
	}
}
