package src.baekjoon;

import java.util.Scanner;

public class BOJ_10797 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;

		for(int i=0; i<5; i++) {
			if(sc.nextInt() % 10 == a) {
				b += 1;
			}
		}

		System.out.println(b);
	}
}
