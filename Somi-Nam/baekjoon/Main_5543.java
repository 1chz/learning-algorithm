package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/5543
 */
public class Main_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minimumBurger = 0;
		for (int i = 0; i < 3; i++) {
			int inputPrice = sc.nextInt();
			if(minimumBurger == 0 || minimumBurger >= inputPrice){
				minimumBurger = inputPrice;
			}
			sc.nextLine();
		}
		int minimumJuice = 0;
		for (int i = 0; i < 2; i++) {
			int inputPrice = sc.nextInt();
			if(minimumJuice == 0 || minimumJuice >= inputPrice){
				minimumJuice = inputPrice;
			}
			sc.nextLine();
		}
		System.out.println(minimumBurger + minimumJuice - 50);
	}
}
