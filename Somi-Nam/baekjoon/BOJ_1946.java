package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1946">
 * https://www.acmicpc.net/problem/1946 신입 사원
 * </a>
 */
public class BOJ_1946 {
public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] participant = new int[N][2];
			for (int j = 0; j < N; j++) {
				StringTokenizer token = new StringTokenizer(br.readLine(), " ");
				participant[j][0] = Integer.parseInt(token.nextToken());
				participant[j][1] = Integer.parseInt(token.nextToken());
			}
			Arrays.sort(participant, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			
			int cnt = 1; // 첫번째 사람은 서류 점수 기준으로 무조건 통과
			int th = participant[0][1]; // 첫번째 사람의 면접 점수
			for (int j = 1; j < participant.length; j++) { // 두번째 사람부터 비교(첫번째 사람 점수와)
				int thSecond = participant[j][1]; // 다음 사람의 면접 점수
				
				if(th > thSecond) {
					// 면접 점수가 더 좋은 사람 // 선발된다 // 기준이 이 사람이 된다
					cnt++;
					th = thSecond;
				}
				if(th == 1) break;
			}
			builder.append(cnt).append("\n");
		}
		br.close();
		
		bw.write(builder.toString());
		bw.flush();
		bw.close();
	
	}
}
