package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a, b;
		String str;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) break;
			
			if(b % a == 0) {
				str = "factor";
			}else if(a % b == 0) {
				str = "multiple";
			}else {
				str = "neither";
			}

			System.out.println(str);
		}
		
		br.close();
	}

}
