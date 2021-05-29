package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10813">
 * https://www.acmicpc.net/problem/10813 공 바꾸기
 * </a>
 */
public class BOJ_10813 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		
		int[] basket = new int[n];
		for (int i = 0; i < basket.length; i++) {
			basket[i] = (i + 1);
		}
		
		for (int i = 0; i < m; i++) {
			// 공 교환
			String[] changeNum = br.readLine().split(" ");
			int first = Integer.parseInt(changeNum[0]) - 1;
			int two = Integer.parseInt(changeNum[1]) - 1;
			
			int temp = basket[first];
			basket[first] = basket[two];
			basket[two] = temp;
		}
		br.close();
		

		StringBuilder builder = new StringBuilder();
		for (int i : basket) {
			builder.append(i).append(" ");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
	}
}
