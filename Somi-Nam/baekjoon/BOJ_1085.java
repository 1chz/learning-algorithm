package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1085">
 * https://www.acmicpc.net/problem/1085 ���簢������ Ż��
 * </a>
 */
public class BOJ_1085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int x = Integer.parseInt(token.nextToken());
		int y = Integer.parseInt(token.nextToken()); // ���� ��ġ (x, y)
		int w = Integer.parseInt(token.nextToken());
		int h = Integer.parseInt(token.nextToken()); // ���簢�� ������ (w, h)
		
		// 0, x, w �Ÿ�
		// 0, y, h �Ÿ�
		
		int answer = 0;
		answer = Math.min(x, (w - x));
		answer = Math.min(answer, y);
		answer = Math.min(answer, (h - y));
		
		System.out.println(answer);
	}
}
