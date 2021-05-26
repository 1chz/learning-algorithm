package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/2231">
 * https://www.acmicpc.net/problem/2231 ������
 * </a>
 */
public class BOJ_2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// ������ �� N�� ���� ��, �ش� ���� K + 'K�� �ڸ� ��'
		// 'K�� �ڸ���'�� �ִ� ���� (9 * �� �ڸ� ��)
		// ���� (N - (9 * 'K �� �ڸ� ��')) ~ (N)���� ���� Ž���ϸ� �ȴ�
		
		int cnt = 0;
		int tempN = N;
		while(tempN != 0) {
			tempN = tempN / 10;
			cnt++;
		}
		
		for (int i = (N - (9 * cnt)), sum = 0, temp = 0; i < N; i++, sum = 0, temp = 0) {
			temp = i;
			while(temp != 0) {
				sum += temp % 10;
				temp = temp / 10;
			}
			sum += i;
			if(sum == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");
	}
}
