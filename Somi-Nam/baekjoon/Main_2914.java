package baekjoon;

import java.util.Scanner;
/**
 * @author NSM
 * https://www.acmicpc.net/problem/2914
 */
public class Main_2914 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int songs = sc.nextInt(); // 곡의 갯수
		int average = sc.nextInt(); // 평균 값
		
		System.out.println(songs * (average - 1) + 1);
	}

}
