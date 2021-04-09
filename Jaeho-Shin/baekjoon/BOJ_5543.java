package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_5522 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bugerArr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int drinkArr[] = {sc.nextInt(),sc.nextInt()};
		int burger = bugerArr[0];
		int drink = drinkArr[0];
		
		for(int i = 1; i<bugerArr.length; i++) {
			if(burger > bugerArr[i]) {
				burger = bugerArr[i];
			}
		}
		
		for(int i = 1; i<drinkArr.length; i++) {
			if(drink > drinkArr[i]) {
				drink = drinkArr[i];
			}
		}
		
		System.out.println(burger + drink - 50);	
		
	}

}
