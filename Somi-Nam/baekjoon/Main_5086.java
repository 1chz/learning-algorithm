package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/5086
 */
public class Main_5086 {
	static String FACTOR = "factor";
	static String MULTIPLE = "multiple";
	static String NEITHER = "neither";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		
		while (true) {
			String read = br.readLine();
			if(read.equalsIgnoreCase("0 0")) break;
			StringTokenizer token = new StringTokenizer(read, " ");
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			
			if (b % a == 0 || a % b == 0) {
				if(a / b > 1 && a % b == 0) builder.append(MULTIPLE).append("\n");
				else builder.append(FACTOR).append("\n");
			} else builder.append(NEITHER).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
