package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10039
 */
public class Main_10039 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int person = 5;
		int sum = 0;
		
		for (int i = 0; i < person; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input < 40) input = 40;
			sum += input;
		}
		
		bw.write(sum / person + "");
		bw.flush();
		
		br.close();
		bw.close();
	}
}
