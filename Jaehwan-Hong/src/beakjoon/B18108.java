package net.acmicpc.problem;

import java.util.Scanner;

public class B18108 {

	public static void main(String[] args) { // 1998년생인 내가 태국에서는 2541년생?!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("불기 연도: ");
		int bb = sc.nextInt();
		
		int bc = bb - 543;
		
		System.out.println("서기 연도: " + bc);
		
	}

}
