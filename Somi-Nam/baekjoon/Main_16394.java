package baekjoon;

import java.util.Scanner;
/**
 * @author NSM
 * https://www.acmicpc.net/problem/16394
 */
public class Main_16394 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anniversary = 1946;
		int currentYear = sc.nextInt();
		System.out.println(currentYear - anniversary);
	}
}
