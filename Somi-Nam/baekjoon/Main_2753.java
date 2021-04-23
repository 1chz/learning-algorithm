package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2753
 */
public class Main_2753 {
	public static void main(String[] args) {
		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0){
			System.out.println("1");
		} else if(year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
