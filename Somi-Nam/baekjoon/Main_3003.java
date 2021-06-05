package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/3003
 */
public class Main_3003 {
	public static void main(String[] args) {
		Integer[] chess = new Integer[]{1, 1, 2, 2, 2, 8};

		Scanner sc = new Scanner(System.in);
		Integer[] inputChess = new Integer[] {sc.nextInt(), sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < chess.length; i++) {
			builder.append(chess[i] - inputChess[i]).append(" ");
		}
		System.out.println(builder.toString());
	}
}
