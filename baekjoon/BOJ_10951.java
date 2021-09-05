package baekjoon;

import java.util.Scanner;

public class BOJ_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
		sc.close();
		
	}
}
