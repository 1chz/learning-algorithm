package baekjoon;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2562
 * 
 * */

public class BOJ_2562 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int intArr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
						sc.nextInt(),sc.nextInt(),sc.nextInt(),
						sc.nextInt(),sc.nextInt(),sc.nextInt()};
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int value : intArr) {
			count ++;
			
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
		
	}
}