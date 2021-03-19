package net.acmicpc.problem;

import java.util.Scanner;

public class B16394 {

	public static void main(String[] args) { // 홍익대학교
		
		int open = 1946;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도: ");
		int year = sc.nextInt();
		
		int anniversary = year - open;
		
		System.out.println(anniversary);
		
	}

}
