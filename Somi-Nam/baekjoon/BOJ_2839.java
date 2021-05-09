package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2839">
 * https://www.acmicpc.net/problem/2839 ���� ���
 * </a>
 */
public class BOJ_2839 {
	static final int BIG = 5;
	static final int SMALL = 3;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		br.close();
		
		// �������� ���
		int result = sugar / BIG;
		int remain = sugar % 5;
		if(remain == 0 && result >= 1) {
			System.out.println(result);
		} else if(remain == 1 && result >= 1) {
			// 6Ű�� // 5Ű�� �ϳ� ���� 3Ű�� 2�� �߰�
			System.out.println(result + 1);
		} else if(remain == 2 && result >= 2) {
			// 12 Ű�� // 2Ű�� �ΰ� ���� 3Ű�� 4�� �߰�
			System.out.println(result + 2);
		} else if(remain == 3) {
			System.out.println(result + 1);
		} else if(remain == 4 && result >= 1) {
			// 9Ű�� // 5Ű�� �ϳ� ���� 3Ű�� 3�� �߰�
			System.out.println(result + 2);
		} else {
			System.out.println("-1");
		}
	}
}