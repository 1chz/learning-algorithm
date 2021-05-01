package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/13277
 */
public class Main_13277 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		BigInteger a = new BigInteger(token.nextToken());
		BigInteger b = new BigInteger(token.nextToken());
		
		bw.write((a.multiply(b)) + "");
//		bw.write(multiplyUsingString(token).toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	
	private static StringBuilder multiplyUsingString(StringTokenizer token){
		char[] charA = token.nextToken().toCharArray();
		char[] charB = token.nextToken().toCharArray();
		
		Map<Integer, Integer> multiMap = new HashMap<>();

		for (int i = 0; i < charA.length; i++) {
			int a = Character.getNumericValue(charA[charA.length - 1 - i]);
			for (int j = 0; j < charB.length; j++) {
				int b = Character.getNumericValue(charB[charB.length - 1 - j]);
				multiMap.put(i+j, multiMap.getOrDefault(i+j, 0) + (a*b));
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < multiMap.size(); i++) {
			int value = multiMap.get(i);
			
			if(value>= 100) {
				multiMap.put(i+2, multiMap.getOrDefault(i+2, 0) + value / 100);
				multiMap.put(i+1, multiMap.getOrDefault(i+1, 0) + (value % 100) / 10);
				multiMap.put(i, value % 10);
			} else if(value >= 10) {
				multiMap.put(i+1, multiMap.getOrDefault(i+1, 0) + value / 10);
				multiMap.put(i, value % 10);
			}
		}
		
		for (int i = multiMap.size() - 1; i >= 0 ; i--) {
			builder.append(multiMap.get(i));
		}
		
		return builder;
	}
}
