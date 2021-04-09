package test;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10817 {
	
	public static void main(String[] args) {
		
		int[] array= new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[1]);
	}

}
