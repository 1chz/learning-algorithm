package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/10219">
 * https://www.acmicpc.net/problem/10219 Meats On The Grill
 * </a>
 */
public class BOJ_10219 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			String[] grill = br.readLine().split(" ");
			int H = Integer.parseInt(grill[0]);
			int W = Integer.parseInt(grill[1]);
			
			for (int j = 0; j < H; j++) {
				String read = br.readLine();
				for (int k = read.length()-1; k >= 0; k--) {
					builder.append(String.valueOf(read.charAt(k)));
				}
				builder.append("\n");
			}
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
