package baekjoon;
/**
 * @author NSM
 * https://www.acmicpc.net/problem/18108
 */
import java.util.Scanner;

public class Main_18108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 불기 = 서기 + 543
		System.out.println(year - 543);
	}
}
