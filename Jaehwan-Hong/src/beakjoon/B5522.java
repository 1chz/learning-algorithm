package net.acmicpc.problem;

import java.util.Scanner;

public class B5522 { // 카드 게임
	
	public static void main(String[] args) {
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 점수: ");
			score += sc.nextInt();
		}
		
		System.out.println("총 점수: " + score);
	}
}
