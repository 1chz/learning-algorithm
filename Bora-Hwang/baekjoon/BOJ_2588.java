package test;

import java.util.Scanner;

public class BOJ_2588 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int[] numArr= new int[3];
		String numStr=Integer.toString(num2);
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=numStr.charAt(i)-'0';
		}
		
		System.out.println(numArr[2]*num);
		System.out.println(numArr[1]*num);
		System.out.println(numArr[0]*num);
		System.out.println(num2*num);
	}
}
