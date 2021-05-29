package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/11720
 */
public class Main_11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine()); 
		
		char[] integerList = new char[cnt];
		integerList = br.readLine().toCharArray();
		int sum = 0;
		for (char c : integerList) {
			sum += Integer.parseInt(String.valueOf(c));
		}
		
		bw.write(sum + "");
		bw.flush();
		
		bw.close();
		br.close();
	}
}
