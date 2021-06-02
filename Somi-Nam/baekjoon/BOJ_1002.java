package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/1002">
 * https://www.acmicpc.net/problem/1002
 * </a>
 * 참조한 사이트 https://mjeong9316.tistory.com/157
 */
public class BOJ_1002 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			// 터렛 1 위치
			int x1 = Integer.parseInt(token.nextToken());
			int y1 = Integer.parseInt(token.nextToken());
			int r1 = Integer.parseInt(token.nextToken()); // 반지름
			// 터렛 2 위치
			int x2 = Integer.parseInt(token.nextToken());
			int y2 = Integer.parseInt(token.nextToken());
			int r2 = Integer.parseInt(token.nextToken()); // 반지름
			
			double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2));
			int sum = r1 + r2;
			int dif = Math.abs(r1 - r2);
			if(sum < d) {
				// r1 + r2 < d 두 원이 내접하지 않음 (교점이 없음)
				builder.append("0").append("\n");
			} else if(dif > d) {
				// |r1 - r2|| > d 원 하나가 나머지 안에 들어가 있음 (교점이 없음)
				builder.append("0").append("\n");
			} else if(d == 0 && r1 == r2) {
				// r1 = r2, d = 0 (원 두개가 완전히 일치)
				builder.append("-1").append("\n");
			} else if(sum == d) {
				// r1 + r2 = d 두 원이 한 점에서 만나고 있음 (교점 1개)
				builder.append("1").append("\n");
			} else if(dif == d) {
				// |r1 - r2| = d 원 하나가 나머지 안에 딱맞게 들어가 있음 (교점 1개)
				builder.append("1").append("\n");
			} else {
				// r1 + r2 > d 두 원이 교집합을 만들고 있음 (교점 2개)
				builder.append("2").append("\n");
			}
		}
		br.close();
		bw.write(builder.toString());
		bw.flush();
		bw.close();
	}
}
