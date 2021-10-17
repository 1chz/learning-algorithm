package src.baekjoon;

import java.util.Scanner;

public class BOJ_2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%d\n%d\n%d\n%d", a*(b%10), a*(b%100/10), a*(b/100), a*b);
	}
}
