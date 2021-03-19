package net.acmicpc.problem;

import java.util.Scanner;

public class B2845 {

	public static void main(String[] args) { // 파티가 끝나고 난 뒤
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람의 수: ");
		int l = sc.nextInt();
		System.out.print("넓이: ");
		int p = sc.nextInt();
		int x = l * p;

		int[] a = new int[5];
		for(int i = 0; i < a.length; i++) {
			System.out.print("참가자 수: ");
			a[i] = sc.nextInt();
		}
		
		System.out.printf("%d %d %d %d %d", a[0] - x, a[1] - x, a[2] - x, a[3] - x, a[4] - x);
		
	}

}
