package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2525
 */
public class Main_2525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(token.nextToken());
		int minute = Integer.parseInt(token.nextToken());
		int cookingTime = Integer.parseInt(br.readLine());
		
		int afterCookingTime = (hour * 60) + minute + cookingTime;
		
		
		bw.write((afterCookingTime / 60) % 24 + " " + afterCookingTime % 60);
		
		br.close();
		bw.close();
		
	}
}
