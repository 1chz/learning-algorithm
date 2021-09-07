package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1075 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		
		int num = n/100 * 100;
		
		while(num%f != 0) {
			num++;
		}
		
		num %= 100;
		
		System.out.printf("%02d", num);
	}
}
