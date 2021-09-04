package src.baekjoon;

import java.util.Scanner;

public class BOJ_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int[] counts = new int[10];
		int number = A * B * C;
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}

		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
	}

}
