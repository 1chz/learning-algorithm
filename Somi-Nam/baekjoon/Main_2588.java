package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2588
 */
public class Main_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int thousands = b / 100;
		int hundreds = (b - 100 * thousands) / 10;
		int tens = b % 10;
		
		int tensA = a * tens;
		int hundredsA = a * hundreds;
		int thousandsA = a * thousands;
		
		StringBuilder builder = new StringBuilder();
		builder.append(tensA).append("\n");
		builder.append(hundredsA).append("\n");
		builder.append(thousandsA).append("\n");
		builder.append(tensA + hundredsA * 10 + thousandsA * 100).append("\n");
		
		System.out.println(builder.toString());
	}
}
