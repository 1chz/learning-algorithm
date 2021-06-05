package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1085">
 * https://www.acmicpc.net/problem/1085 직사각형에서 탈출
 * </a>
 */
public class BOJ_1085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int x = Integer.parseInt(token.nextToken());
		int y = Integer.parseInt(token.nextToken()); // 현재 위치 (x, y)
		int w = Integer.parseInt(token.nextToken());
		int h = Integer.parseInt(token.nextToken()); // 직사각형 꼭지점 (w, h)
		
		// 0, x, w 거리
		// 0, y, h 거리
		
		int answer = 0;
		answer = Math.min(x, (w - x));
		answer = Math.min(answer, y);
		answer = Math.min(answer, (h - y));
		
		System.out.println(answer);
	}
}
