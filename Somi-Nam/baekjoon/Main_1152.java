package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @author NSM
 * https://www.acmicpc.net/problem/1152
 */
public class Main_1152 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int wordCnt = token.countTokens();
		
		bw.write(wordCnt+"");
		bw.flush();
		
		bw.close();
		br.close();
	}

}
