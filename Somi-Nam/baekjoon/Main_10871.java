package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10871
 */
public class Main_10871 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int inputLength = Integer.parseInt(token.nextToken());
		int n = Integer.parseInt(token.nextToken());
		
		StringTokenizer inputToken = new StringTokenizer(br.readLine(), " ");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < inputLength; i++) {
			int value = Integer.parseInt(inputToken.nextToken());
			if(value < n) 
				builder.append(value).append(" ");
		}
		
		bw.write(builder.toString());
		
		br.close();
		bw.close();
	}
}
