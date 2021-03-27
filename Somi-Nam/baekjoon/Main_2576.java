package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2576
 */
public class Main_2576 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		int min = 0;
		for (int i = 0; i < 7; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input % 2 != 0) {
				if(min == 0 || min > input) min = input;
				sum += input;
			}
		}
		if(sum == 0){
			bw.write("-1");
		} else {
			StringBuilder builder = new StringBuilder();
			builder.append(sum).append("\n").append(min);
			bw.write(builder.toString());
		}
		
		
		br.close();
		bw.close();
	}
}
