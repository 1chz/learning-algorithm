package baekjoon;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2163
 * @author NSM
 */
public class BOJ_2163 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		br.close();
		
		int n = Integer.parseInt(read.substring(0, read.indexOf(" ")));
		int m = Integer.parseInt(read.substring(read.indexOf(" ")).trim());
		
		int answer = (n -1) + (n * (m - 1));
		
		System.out.println(answer);
	}
}
