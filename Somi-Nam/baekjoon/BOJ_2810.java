package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/2810">
 * https://www.acmicpc.net/problem/2810 дех╕╢У
 * </a>
 */
public class BOJ_2810 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String seats = br.readLine();
		br.close();
		
		
		int answer = 0;
		for (int i = 0; i < seats.length(); i++) {
			answer++;
			if(seats.charAt(i) == 'L') i++;
		}
		answer++;
		System.out.println(answer > n ? n : answer);
	}
}
