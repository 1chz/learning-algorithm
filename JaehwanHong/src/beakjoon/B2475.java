package net.acmicpc.problem;

import java.util.Scanner;

public class B2475 {

	public static void main(String[] args) { // 검증수
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 숫자: ");
			sum += Math.pow(sc.nextInt(), 2);
		}
		
		System.out.print(sum % 10);
		
	}

}
