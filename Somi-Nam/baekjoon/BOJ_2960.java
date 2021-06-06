package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/2960">
 * https://www.acmicpc.net/problem/2960 에라토스테네스의 체
 * </a>
 */
public class BOJ_2960 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int N = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		int[] nList = new int[N - 1];
		
		for (int i = 2, cnt = 0; i <= N; i++) {
			nList[cnt++] = i;
		}
	
		int p = 2;
		int removeNum = 2;
		while(k != 0) {
			
			for (int i = 0; i < nList.length; i++) {
				if(nList[i] != 0 && nList[i] % p == 0) {
					removeNum = nList[i];
					nList[i] = 0;
					k--;
					if(k == 0) break;
				}
			}
			
			// p 찾기
			for (int i = 0; i < nList.length; i++) {
				if(nList[i] != 0) {
					p = nList[i];
					break;
				}
			}
		}
		
		System.out.println(removeNum);
	}
}
