package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1652">
 * https://www.acmicpc.net/problem/1652 ���� �ڸ��� ã�ƶ�
 * </a>
 */
public class BOJ_1652 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		char[][] roomInfo = new char[n][n];
		
		int rowCnt = 0;
		int columsCnt = 0;

		for (int i = 0; i < n; i++) {
			String rowString = br.readLine();
			roomInfo[i] = rowString.toCharArray(); 
			
			// ���� �� �˻�
			StringTokenizer token = new StringTokenizer(rowString, "X");
			while(token.hasMoreTokens()) {
				if(token.nextToken().length() >= 2) rowCnt++;
			}
		}
		
		// ���� �� �˻�
		for (int i = 0; i < n; i++) {
			int next = 0;
			for (int j = 0; j < n; j++) {
				char c = roomInfo[j][i];
				if(c == '.') {
					next++;
				} else if(c != '.') {
					if(next >= 2) {
						columsCnt++;
					}
					next = 0;
					continue;
				}
			}
			if (next >= 2) {
				columsCnt++;
			}
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append(rowCnt).append(" ").append(columsCnt);
		
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
