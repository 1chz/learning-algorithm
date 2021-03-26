package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2742
 */
public class Main_2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < input; i++) {
			builder.append(input - i).append("\n");
		}
		
		bw.write(builder.toString());
		
		br.close();
		bw.close();

	}
}
