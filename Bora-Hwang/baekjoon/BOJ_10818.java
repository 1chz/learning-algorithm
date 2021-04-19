package test;

import java.util.Scanner;

public class BOJ_10818 {
	public static void main(String[] args) {
		int length;
		int num;
		int min;
		int max;
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		min=sc.nextInt();
		max=min;
		for(int i=1;i<length;i++) {
			num=sc.nextInt();
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.println(min+" "+ max);
	}
}
