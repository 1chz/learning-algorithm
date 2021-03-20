package baekjoon;

import java.util.Scanner;

public class BJ_5522 {
	public static void main(String[] agrs){
		int result = 0;
		Scanner sc = new Scanner(System.in);
	
		for(int i=0;i<5;i++) {
				result+=sc.nextInt();
		}
		System.out.println(result);
	}
}
