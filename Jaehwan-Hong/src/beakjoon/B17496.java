package net.acmicpc.problem;

import java.util.Scanner;

public class B17496 {

	public static void main(String[] args) { // 스타후르츠
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여름 일 수: ");
		int n = sc.nextInt();
		System.out.print("자라는 일 수: ");
		int t = sc.nextInt();
		System.out.print("칸 수: ");
		int c = sc.nextInt();
		System.out.print("개당 가격: ");
		int p = sc.nextInt();
		
		int count = (n - 1) / t; // 수확 횟수
		
		System.out.print(count * c * p);
		
	}

}
