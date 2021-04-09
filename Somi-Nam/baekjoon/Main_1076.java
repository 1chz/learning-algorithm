package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1076
 */
public class Main_1076 {
	enum Resistance {
		BLACK, BROWN, RED, ORANGE, YELLOW,
		GREEN, BLUE, VIOLET, GREY, WHITE,
		;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer[] regist = new Integer[] {
				Resistance.valueOf(br.readLine().toUpperCase()).ordinal(),
				Resistance.valueOf(br.readLine().toUpperCase()).ordinal(),
				Resistance.valueOf(br.readLine().toUpperCase()).ordinal(),
		};
		int sumResistance = regist[0] * 10 + regist[1];
		long answer = (long) (sumResistance * Math.pow(10, regist[2]));
		System.out.println(answer);
		
		br.close();
	}
}
