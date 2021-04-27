package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/14696">
 * https://www.acmicpc.net/problem/14696 딱지놀이
 * </a>
 */
public class BOJ_14696 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 라운드 횟수
		// 별, 동그라미, 네모, 세모를 각각 숫자 4, 3, 2, 1
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int[] a = new int[4];
			int[] b = new int[4];

			StringTokenizer aToken = new StringTokenizer(br.readLine(), " ");
			aToken.nextToken();
			while(aToken.hasMoreTokens()) {
				a[Integer.parseInt(aToken.nextToken()) - 1]++;
			}
			
			StringTokenizer bToken = new StringTokenizer(br.readLine(), " ");
			bToken.nextToken();
			while(bToken.hasMoreTokens()) {
				b[Integer.parseInt(bToken.nextToken()) - 1]++;
			}
			
			for (int j = a.length - 1; j >= 0; j--) {
				if(a[j] != b[j]) {
					if(a[j] > b[j]) builder.append("A").append("\n");
					else builder.append("B").append("\n");
					break;
				}
				if(j == 0) {
					builder.append("D").append("\n");
				}
			}
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
