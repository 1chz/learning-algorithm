package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10797
 */
public class Main_10797 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int day = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		do {
			if(Integer.parseInt(token.nextToken()) == day) count++;
		} while (token.hasMoreTokens());
		
		bw.write(count + "");
		
		br.close();
		bw.close();
	}
}
