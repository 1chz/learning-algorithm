package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_8958 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		int count, total;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			
			count = 0;
			total = 0;
			
			str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					total += ++count;
				}else {
					count = 0;
				}
			}
			
			System.out.println(total);
		}
	}
}
