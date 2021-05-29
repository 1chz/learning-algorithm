package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2884">
 * https://www.acmicpc.net/problem/2884 알람 시계
 * </a>
 */
public class BOJ_2884 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int hh = Integer.parseInt(token.nextToken());
		int mm = Integer.parseInt(token.nextToken());
		br.close();
		
		int time = (hh * 60) + mm;
		time -= 45;
		
		StringBuilder builder = new StringBuilder();
		if(time >= 0) {
			builder.append(time / 60).append(" ").append(time % 60);
		} else {
			builder.append(23).append(" ").append(60 + time);
		}
		
		bw.write(builder.toString());
		bw.flush();
		bw.close();
	}
}
