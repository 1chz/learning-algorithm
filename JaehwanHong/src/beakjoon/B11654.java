package net.acmicpc.problem;

import java.util.Scanner;

public class B11654 { // 아스키코드
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char str = sc.nextLine().charAt(0);
		
		int result = (int)str;
		
		System.out.print(result);
		
	}

}
