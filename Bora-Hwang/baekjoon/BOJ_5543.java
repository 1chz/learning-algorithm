package codingTest;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		int minHam=sc.nextInt();
		for(int i=1;i<3;i++) {
			x=sc.nextInt();
			if(minHam>x) {
				minHam=x;
			}
		}
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>y) {
			System.out.println(minHam+y-50);
		}else {
			System.out.println(minHam+x-50);
		}
		
	}
	
}
