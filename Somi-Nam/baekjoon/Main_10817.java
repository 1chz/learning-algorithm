package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10817
 */
public class Main_10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] integerList = new Integer[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(integerList);
		
		System.out.println(integerList[1]);
	}
}
