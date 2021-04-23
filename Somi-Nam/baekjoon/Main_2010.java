package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2010
 */
public class Main_2010 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int connectPC = 0;
		for (int i = 0; i < n; i++) {
			connectPC = connectPC + Integer.parseInt(br.readLine());
			if(i != n-1) connectPC--;
		}
		
		bw.write(connectPC+"");
		
		br.close();
		bw.close();
	}
}
