package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/2720">
 * https://www.acmicpc.net/problem/2720 ºº≈πº“ ªÁ¿Â µø«ı
 * </a>
 */
public class BOJ_2720 {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		int[] moneyValue = {25, 10, 5, 1};
		
		for (int i = 0; i < n; i++) {
			int c = Integer.parseInt(br.readLine());
			int[] money = new int[4];
			
			for (int j = 0; j <= 3; j++) {
				if(c >= moneyValue[j]) {
					money[j] = c / moneyValue[j];
					c = c % moneyValue[j];
				}
			}
			
			for (int j = 0; j <= 3; j++) builder.append(money[j]).append(" ");
			builder.append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
