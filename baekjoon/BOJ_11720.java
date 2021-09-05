package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int total = 0;
		
		for(int i=0; i<str.length(); i++) {
			total += str.charAt(i) - '0';
		}
		
		System.out.println(total);
	}
}