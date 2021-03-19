package net.acmicpc.problem;

import java.util.Scanner;

public class B14645 { // 와이버스 부릉부릉

	public static void main(String[] args) {
		String driver = "비와이";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정거장 수: ");
		int n = sc.nextInt();
		System.out.print("탑승 인원: ");
		int k = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("탑승 인원: ");
			int a = sc.nextInt();
			System.out.print("하차 인원: ");
			int b = sc.nextInt();
		}
		
		System.out.println(driver);

	}

}
