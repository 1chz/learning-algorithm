package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			
			int count = Integer.parseInt(st.nextToken());
			int total = 0;
			int result = 0;
			
			int cases[] = new int[count];
			
			for(int j=0; j<count; j++) {
				cases[j] = Integer.parseInt(st.nextToken());
				total += cases[j];
			}
			
			int avg = total / count;
			
			for(int j=0; j<count; j++) {
				
				if(cases[j] > avg) {
					result++;
				}
			}

			System.out.printf("%.3f", 100.0 * result / count);
			System.out.println("%");
		}
	}
}