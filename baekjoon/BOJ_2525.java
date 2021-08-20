package baekjoon;

import java.util.Scanner;

public class BOJ_2525 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		
		m += time;
		
		if(m>60) {
			while(m>=60) {
				m -= 60;
				h += 1;
			}
		}
		
		if(h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
	}

}
