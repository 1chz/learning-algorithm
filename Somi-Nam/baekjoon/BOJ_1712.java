package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1712">
 * https://www.acmicpc.net/problem/1712 ���ͺб���
 * </a>
 */
public class BOJ_1712 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		long a = Long.parseLong(token.nextToken());
		long b = Long.parseLong(token.nextToken());
		long c = Long.parseLong(token.nextToken());
		
		long pureProfit = c - b;
		if(pureProfit <= 0) {
			// ���� ���� ����
			System.out.println("-1");
			return;
		}
		
		long value = a / c; // ���� ��� ����
		long n = (a % c) + (b * value); // ���� ���
		
		// ���� �߻�
		value += (n / pureProfit) + 1;
		System.out.println(value);
	}
}
