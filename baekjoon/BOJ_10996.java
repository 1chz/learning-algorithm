package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10996 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
	
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-(num/2); j++) {
				System.out.print("* ");
			}
			System.out.println("");
			for(int k=0; k<num/2; k++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		br.close();
	}
}
