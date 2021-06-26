package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/14659">
 * https://www.acmicpc.net/problem/14659 한조서열정리하고옴ㅋㅋ
 * </a>
 */
public class BOJ_14659 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] mountain = new int[n];
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < mountain.length; i++) {
			mountain[i] = Integer.parseInt(token.nextToken());
		}
		br.close();
		
		int bestShooter = 0, thisShooter = 0;
		int comp = mountain[0];
		for (int i = 1; i < mountain.length; i++) {
			if(comp > mountain[i]) {
				++thisShooter;
			} else {
				if(bestShooter < thisShooter) bestShooter = thisShooter;
				thisShooter = 0;
				comp = mountain[i];
			}
		}
		if(bestShooter < thisShooter) bestShooter = thisShooter;
		System.out.println(bestShooter);
	}
}
