package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/4673">
 * https://www.acmicpc.net/problem/4673 ¼¿ÇÁ ³Ñ¹ö
 * </a>
 */
public class BOJ_4673 {
	static int MAX = 10001;
	public static void main(String[] args) throws Exception {
		int[] answer = new int[MAX];
		answer[0] = 0;
		
		for (int number = 1; number < MAX; number++) {
			if(answer[number] == 1) continue;
			int value = number;
			int sum = value;
			while(true) {
				sum += (value % 10);
				value = value / 10;
				if(value == 0) {
					value = sum;
					if(sum >= MAX || answer[sum] == 1) {
						break;
					}
					answer[sum] = 1;
				}
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 2; i < answer.length; i++) {
			if(answer[i - 1] == 0) builder.append(i - 1).append("\n");
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
	}
}
