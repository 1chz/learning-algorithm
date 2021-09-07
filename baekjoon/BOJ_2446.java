package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2446 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=num; i>0; i--) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1; i<num; i++) {
			for(int j=num; j>i+1; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		br.close();
	}
}