package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1225 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		String a = token.nextToken();
		String b = token.nextToken();
		
		long sum = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				// Char <-> int ¹æ¹ý
				// 1. char - 49
//				sum += (a.charAt(i) - 48) * (b.charAt(j) - 48);
				// 2. Character.getNumericValue(c1)
				sum += Character.getNumericValue(a.charAt(i)) * Character.getNumericValue(b.charAt(j));
			}
		}
		
		System.out.println(sum);
	}
}
