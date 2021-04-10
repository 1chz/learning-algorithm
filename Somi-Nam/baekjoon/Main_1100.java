package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1100
 */
public class Main_1100 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result = 0;
		
		char[][] chess = new char[8][8];
		for (int i = 0; i < 8; i++) {
			chess[i] = br.readLine().toCharArray();
		}
		
		boolean white = true;
		for (int i = 0; i < chess.length; i++) {
			char[] chessRow = chess[i];
			for (int j = 0; j < chessRow.length; j++) {
				char c = chessRow[j];
				if(String.valueOf(c).equals("F") && white) result++;
				white = !white;
			}
			white = !white;
		}
		
		bw.write(result+"");
		bw.flush();
		
		bw.close();
		br.close();
	}
}
