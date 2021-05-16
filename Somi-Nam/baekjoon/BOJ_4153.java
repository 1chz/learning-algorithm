package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/4153">
 * https://www.acmicpc.net/problem/4153 Á÷°¢»ï°¢Çü
 * </a>
 */
public class BOJ_4153 {
	
	static final String RIGHT = "right";
	static final String WRONG = "wrong";
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		
		do {
			String read = br.readLine();
			if(read.equalsIgnoreCase("0 0 0")) break;
			
			StringTokenizer token = new StringTokenizer(read, " ");
			int[] tri = new int[3];
			for (int i = 0; i < tri.length; i++) tri[i] = Integer.parseInt(token.nextToken());
			Arrays.sort(tri);
			
			if(tri[0]*tri[0] + tri[1]*tri[1] == tri[2]*tri[2]) {
				builder.append(RIGHT);
			} else builder.append(WRONG);
			builder.append("\n");
			
		} while (true);
		br.close();
		
		bw.write(builder.toString());
		bw.flush();
		bw.close();
	}
}
