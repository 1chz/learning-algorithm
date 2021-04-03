package codingTest;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		int count =1;
		int num=1;
		
		Scanner sc = new Scanner(System.in);
		int max=sc.nextInt();
		int x=0;
		
		for(int i=0;i<8;i++) {
			count++;
			x=sc.nextInt();
			if(max<x) {
				max=x;
				num=count;
			}
			
		}
		System.out.println(max);
		System.out.println(num);
		

	}
	
}
