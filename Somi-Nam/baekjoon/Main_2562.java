package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2562
 */
public class Main_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int large = 0;
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			int input = sc.nextInt();
			if(input > large){
				large = input;
				cnt = i + 1;
			}
			sc.nextLine();
		}
		
		System.out.println(large);
		System.out.println(cnt);
	}
}
