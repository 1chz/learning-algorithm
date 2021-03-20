package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/17256
 */
public class Main_17256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] inputA = new Integer[3]; // x, y, z
		Integer[] inputC = new Integer[3]; // x, y, z
		for (int i = 0; i < inputA.length; i++) {
			inputA[i] = sc.nextInt();
		}
		sc.nextLine();
		for (int i = 0; i < inputC.length; i++) {
			inputC[i] = sc.nextInt();
		}
		// a 🍰 b = (a.z + b.x, a.y × b.y, a.x + b.z)
			// inputA[2] + outputB[0] = inputC[0]
			// inputA[1] * outputB[1] = inputC[1]
			// inputA[0] + outputB[2] = inputC[2]

		// get B
		Integer[] outputB = new Integer[3];
		outputB[0] = inputC[0] - inputA[2];
		outputB[1] = inputC[1] / inputA[1];
		outputB[2] = inputC[2] - inputA[0];
		
		System.out.println(String.format("%d %d %d", outputB[0], outputB[1], outputB[2]));
	}

}
