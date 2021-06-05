package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/11654
 */
public class Main_11654 {
	public static void main(String[] args) {
		// 입력 문자 ASCII 코드 변환
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for (byte inputByte : input.getBytes()) {
			System.out.print(inputByte);
		}
	}
}
