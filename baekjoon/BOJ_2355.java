package baekjoon;

import java.util.Scanner;

public class BOJ_2355 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a<b) {
			System.out.println((a+b)*(b-a+1)/2);
		}else {
			System.out.println((a+b)*(a-b+1)/2);
		}
	}

}
