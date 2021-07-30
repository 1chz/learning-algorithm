package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1946">
 * https://www.acmicpc.net/problem/1946 ���� ���
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
			
			int cnt = 1; // ù��° ����� ���� ���� �������� ������ ���
			int th = participant[0][1]; // ù��° ����� ���� ����
			for (int j = 1; j < participant.length; j++) { // �ι�° ������� ��(ù��° ��� ������)
				int thSecond = participant[j][1]; // ���� ����� ���� ����
				
				if(th > thSecond) {
					// ���� ������ �� ���� ��� // ���ߵȴ� // ������ �� ����� �ȴ�
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
