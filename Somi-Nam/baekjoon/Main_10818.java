package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10818
 */
public class Main_10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer[] integerList = new Integer[Integer.parseInt(reader.readLine())];
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		for (int i = 0; i < integerList.length; i++) {
			integerList[i] = Integer.parseInt(token.nextToken());
		}
		
		int max = integerList[0];
		int min = integerList[0];
		for (Integer integer : integerList) {
			if(integer < min){
				min = integer;
			} else if(integer > max){
				max = integer;
			}
		}
		
		StringBuilder builder = new StringBuilder();
//		Arrays.sort(integerList);
//		builder.append(integerList[0]).append(" ").append(integerList[integerList.length - 1]);
		builder.append(min).append(" ").append(max);
		writer.write(builder.toString());
		
		
		reader.close();
		writer.close();
	}
}
