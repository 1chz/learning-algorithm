package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10250">
 * https://www.acmicpc.net/problem/10250 ACM È£ÅÚ
 * </a>
 */
public class BOJ_10250 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(token.nextToken()); // ³ôÀÌ
			int W = Integer.parseInt(token.nextToken()); // Æø
			int N = Integer.parseInt(token.nextToken()); // ¼Õ´Ô
			
			int w = N / H;
			int h = N % H;
			if(h == 0) {
				h = H;
				w--;
			}
			
			builder.append(h*100 + (w+1)).append("\n");
			
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
