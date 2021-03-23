package net.acmicpc.problem;

import java.util.Scanner;

public class B5554 {

	public static void main(String[] args) { // 심부름 가는 길
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i = 1; i <= 4; i++) {
			System.out.print(i + "번째 이동 시간: ");
			count += sc.nextInt();
		}
		
		System.out.println(count / 60);
		System.out.println(count % 60);
	}

}
