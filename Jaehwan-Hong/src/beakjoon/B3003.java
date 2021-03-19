package net.acmicpc.problem;

import java.util.Scanner;

public class B3003 {

	public static void main(String[] args) { // 킹, 퀸, 룩, 비숍, 나이트, 폰
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("킹: ");
		int n1 = sc.nextInt();
		
		System.out.print("퀸: ");
		int n2 = sc.nextInt();
		
		System.out.print("룩: ");
		int n3 = sc.nextInt();
		
		System.out.print("비숍: ");
		int n4 = sc.nextInt();
		
		System.out.print("나이트: ");
		int n5 = sc.nextInt();
		
		System.out.print("폰: ");
		int n6 = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", 1 - n1, 1 - n2, 2 - n3, 2 - n4, 2 - n5, 8 - n6);
		
	}

}
