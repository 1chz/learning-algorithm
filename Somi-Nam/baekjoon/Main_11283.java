package baekjoon;

import java.util.Scanner;

/**
 * @author NSM 
 * https://www.acmicpc.net/problem/11283
 * 참조 https://gs.saro.me/dev?tn=521
 */
public class Main_11283 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(inputString.toCharArray()[0] - '가' + 1);
	}
	
	public static int getParser(String text) {
		int returnInteger =  0;
		for (char ch : text.toCharArray()) {
			int ce = ch - '가';
			returnInteger = ce + 1;
		}
		return returnInteger;
	}
}
