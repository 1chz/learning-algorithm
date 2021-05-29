package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2845
 */
public class Main_2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allPerson = sc.nextInt() * sc.nextInt();
		sc.nextLine();
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			builder.append(sc.nextInt() - allPerson).append(" ");
		}
		System.out.println(builder.toString());
	}
}
