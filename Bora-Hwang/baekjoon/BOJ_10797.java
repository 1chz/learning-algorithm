package test;

import java.util.Scanner;

public class BOJ_10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carNum=sc.nextInt();
		int answer=0;
		
		for(int i=0;i<5;i++) {
			if(sc.nextInt()==carNum) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
