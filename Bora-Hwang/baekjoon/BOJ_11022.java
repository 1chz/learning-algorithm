package codingTest;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc= new Scanner(System.in);
		int num;
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println("Case #"+i+": "+x+" + "+y+" = "+(x+y));
		}

	}
	
}
