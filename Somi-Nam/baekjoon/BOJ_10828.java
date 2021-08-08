package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/10828">
 * https://www.acmicpc.net/problem/10828 스택
 * </a>
 */
public class BOJ_10828 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int move = 0;
		int[] stack = new int[100000];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			switch (token.nextToken()) {
			case "push":
				// push X: 정수 X를 스택에 넣는 연산이다.
				stack[move++] = Integer.parseInt(token.nextToken());
				break;
			case "pop":
				// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
				// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(move >= 1) {
					builder.append(stack[--move]).append("\n");
				} else {
					builder.append("-1").append("\n");
				}
				break;
			case "size":
				// size: 스택에 들어있는 정수의 개수를 출력한다.
				builder.append(move).append("\n");
				break;
			case "empty":
				// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
				if(move == 0) {
					builder.append("1").append("\n");
				} else {
					builder.append("0").append("\n");
				}
				break;
			case "top":
				// top: 스택의 가장 위에 있는 정수를 출력한다. 
				// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(move == 0) {
					builder.append("-1").append("\n");
				} else {
					builder.append(stack[move - 1]).append("\n");
				}
				break;
			}
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
