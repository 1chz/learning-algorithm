package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10039 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;
		
		for(int i=0; i<5; i++) {
			int a = Integer.parseInt(br.readLine());
			total += a<40 ? 40 : a;
		}
		
		System.out.println(total/5);
		
		br.close();
	}

}
