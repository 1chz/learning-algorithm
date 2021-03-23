package net.acmicpc.problem;

import java.util.Scanner;

public class B17256 {

	public static void main(String[] args) { // 달달함이 넘쳐흘러
		
		/*
		az + bx, ay * by, ax + bz = cx, cy, cz
		
		bx = cx - az
		by = cy / ay
		bz = cz - ax
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("케이크 a: ");
		int ax = sc.nextInt();
		int ay = sc.nextInt();
		int az = sc.nextInt();
		
		System.out.println("케이크 c: ");
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int cz = sc.nextInt();
		
		int bx = cx - az;
		int by = cy / ay;
		int bz = cz - ax;
		
		System.out.print(bx + " " + by + " " + bz);
		
	}

}
