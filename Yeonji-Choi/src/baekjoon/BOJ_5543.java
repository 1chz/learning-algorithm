package src.baekjoon;

import java.util.Scanner;

public class BOJ_5543 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] bg = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

		int d1 = sc.nextInt();
		int d2 = sc.nextInt();

		int b = bg[0] < bg[1] ? bg[0] < bg[2] ? bg[0] : bg[2] : bg[1] < bg[2] ? bg[1] : bg[2];

		int result = d1 < d2 ? b+d1-50 : b+d2-50;

		System.out.println(result);
	}

}
