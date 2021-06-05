package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/3985">
 * https://www.acmicpc.net/problem/3985 롤 케이크
 * </a>
 */
public class BOJ_3985 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int L = Integer.parseInt(br.readLine()); // 롤 케이크 길이
		int N = Integer.parseInt(br.readLine()); // 방청객 수
		
		int[] cake = new int[L]; // 롤 케이크
		int[] cakePerEach = new int[N]; // 방청객 당 가진 조각 수
		int[] wantCakePerEach = new int[N]; // 방청객 당 원하는 조각 수
		int bestWantCake = 0;
		int bestPerCake = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int startP = Integer.parseInt(token.nextToken()) - 1;
			int endP = Integer.parseInt(token.nextToken()) - 1;
			
			int want = endP - startP + 1;
			int getCake = 0;
			for (int j = startP; j <= endP; j++) {
				if(cake[j] == 0) {
					getCake++;
					cake[j]++;
				} else continue;
			}
			wantCakePerEach[i] = want;
			cakePerEach[i] = getCake;
			
			bestWantCake = want >= bestWantCake ? want : bestWantCake;
			bestPerCake = getCake >= bestPerCake ? getCake : bestPerCake;
		}
		
		StringBuilder builder = new StringBuilder();
		
		
		for (int i = 0; i < wantCakePerEach.length; i++) {
			if(bestWantCake == wantCakePerEach[i]) {
				builder.append(i+1).append("\n");
				break;
			}
		}
		for (int i = 0; i < cakePerEach.length; i++) {
			if(bestPerCake == cakePerEach[i]) {
				builder.append(i+1);
				break;
			}
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
