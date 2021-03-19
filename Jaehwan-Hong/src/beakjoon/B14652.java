package net.acmicpc.problem;

import java.util.Scanner;

public class B14652 {

	public static void main(String[] args) { // 나는 행복합니다~
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세로 길이: ");
		int n = sc.nextInt();
		System.out.print("가로 길이: ");
		int m = sc.nextInt();
		System.out.print("관중석 번호: ");
		int k = sc.nextInt();
				
//		int[][] arr = new int[n][m];
//		
//		int count = 0;
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				arr[i][j] = count;
//				count++;
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				if(arr[i][j] == k) {
//					System.out.print(i + " " + j);
//				}
//			}
//		}
		
		System.out.print((k / m) + " " + (k % m));
		
	}

}
