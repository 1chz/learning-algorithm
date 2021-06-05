package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/1002">
 * https://www.acmicpc.net/problem/1002
 * </a>
 * ������ ����Ʈ https://mjeong9316.tistory.com/157
 */
public class BOJ_1002 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			// �ͷ� 1 ��ġ
			int x1 = Integer.parseInt(token.nextToken());
			int y1 = Integer.parseInt(token.nextToken());
			int r1 = Integer.parseInt(token.nextToken()); // ������
			// �ͷ� 2 ��ġ
			int x2 = Integer.parseInt(token.nextToken());
			int y2 = Integer.parseInt(token.nextToken());
			int r2 = Integer.parseInt(token.nextToken()); // ������
			
			double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2));
			int sum = r1 + r2;
			int dif = Math.abs(r1 - r2);
			if(sum < d) {
				// r1 + r2 < d �� ���� �������� ���� (������ ����)
				builder.append("0").append("\n");
			} else if(dif > d) {
				// |r1 - r2|| > d �� �ϳ��� ������ �ȿ� �� ���� (������ ����)
				builder.append("0").append("\n");
			} else if(d == 0 && r1 == r2) {
				// r1 = r2, d = 0 (�� �ΰ��� ������ ��ġ)
				builder.append("-1").append("\n");
			} else if(sum == d) {
				// r1 + r2 = d �� ���� �� ������ ������ ���� (���� 1��)
				builder.append("1").append("\n");
			} else if(dif == d) {
				// |r1 - r2| = d �� �ϳ��� ������ �ȿ� ���°� �� ���� (���� 1��)
				builder.append("1").append("\n");
			} else {
				// r1 + r2 > d �� ���� �������� ����� ���� (���� 2��)
				builder.append("2").append("\n");
			}
		}
		br.close();
		bw.write(builder.toString());
		bw.flush();
		bw.close();
	}
}
