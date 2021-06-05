package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2355
 */
public class Main_2355 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		long answer = 0;
		long first = Long.parseLong(token.nextToken());
		long last = Long.parseLong(token.nextToken());
		
		if(first > last) answer = (first + last) * (first - last + 1) / 2;
		else answer = (first + last) * (last - first + 1) / 2;
			
		
		bw.write(answer+"");
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	private static int sigma(int first, int needSum, int allSum) {
		if(needSum == first){
			allSum = allSum + first;
		} else {
			allSum = allSum + needSum;
			allSum = sigma(first, needSum - 1, allSum);
		}
		return allSum;
	}

}
