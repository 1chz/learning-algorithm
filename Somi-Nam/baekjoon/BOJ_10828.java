package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/10828">
 * https://www.acmicpc.net/problem/10828 ����
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
				// push X: ���� X�� ���ÿ� �ִ� �����̴�.
				stack[move++] = Integer.parseInt(token.nextToken());
				break;
			case "pop":
				// pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. 
				// ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
				if(move >= 1) {
					builder.append(stack[--move]).append("\n");
				} else {
					builder.append("-1").append("\n");
				}
				break;
			case "size":
				// size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
				builder.append(move).append("\n");
				break;
			case "empty":
				// empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
				if(move == 0) {
					builder.append("1").append("\n");
				} else {
					builder.append("0").append("\n");
				}
				break;
			case "top":
				// top: ������ ���� ���� �ִ� ������ ����Ѵ�. 
				// ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
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
