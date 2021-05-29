package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 *  https://www.acmicpc.net/problem/2475
 */
public class Main_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int allSum = 0;
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			allSum += (input * input);
		}
		
		System.out.println(allSum % 10);
	}
}
