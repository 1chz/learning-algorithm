package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/16430
 */
public class Main_16430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerator = sc.nextInt();
		int denominator = sc.nextInt();
		
		StringBuilder builder = new StringBuilder();
		builder.append(denominator-numerator).append(" ").append(denominator);
		System.out.println(builder.toString());
	}
}
