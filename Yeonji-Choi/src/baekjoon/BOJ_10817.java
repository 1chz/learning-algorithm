package src.baekjoon;

import java.util.Scanner;

public class BOJ_10817 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int tmp = 0;

		for(int i = 0; i < 3; i++) {

			for(int j = i+1; j < 3; j++) {

				if(num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}

		System.out.println(num[2]);
	}
}
