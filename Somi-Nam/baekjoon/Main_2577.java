package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2577
 */
public class Main_2577 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		char[] allmulti = ((a * b * c)+"").toCharArray();
		Integer[] integerCnt = new Integer[] {0,0,0,0,0,0,0,0,0,0};
		
		for (char character : allmulti) {
			int charInt = Integer.parseInt(character+"");
			integerCnt[charInt] = integerCnt[charInt] + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (Integer integer : integerCnt) {
			sb.append(integer+"").append("\n");
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
