package baekjoon;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2501">
 * https://www.acmicpc.net/problem/2501 약수 구하기
 * </a>
 */
public class BOJ_2501 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		br.close();
		
		List<Integer> input = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) input.add(i);
		}
		
		if(input.size() < K) {
			System.out.println("0");
		} else System.out.println(input.get(K - 1));
		
	}
}
