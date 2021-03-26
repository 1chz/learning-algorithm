package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5522 {
	
	public static void main(String[] args) throws IOException {
		
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1; i<=5; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			max += Integer.parseInt( st.nextToken());	
		}
		br.close();
		
		System.out.println(max);
	}

}
