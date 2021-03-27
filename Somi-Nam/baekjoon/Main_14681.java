package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/14681
 */
public class Main_14681 {
	public static void main(String[] args) {
		// (-,+)2  (+,+)1
		// (-,-)3  (+,-)4
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int square = 0;
		
		if(x * y > 0) {
			if(x > 0){
				square = 1;
			} else square = 3;
		} else {
			if(y > 0){
				square = 2;
			}else square = 4;
		}
		System.out.println(square);
	}
}
