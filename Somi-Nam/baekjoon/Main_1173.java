package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1173
 */
public class Main_1173 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		
		int minute = 0;
		
		int N = Integer.parseInt(token.nextToken()); // 운동 하려는 분
		int m = Integer.parseInt(token.nextToken()); // 맥박 최소값 // 초기 맥박
		int M = Integer.parseInt(token.nextToken()); // 맥박 최대값
		int T = Integer.parseInt(token.nextToken()); // 운동 한 후 맥박 증가값
		int R = Integer.parseInt(token.nextToken()); // 휴식 시 떨어지는 맥박 값
		
		if(m + T > M) bw.write("-1"); // 1분도 운동할 수 없음
		else{
			int x = m;
			while(N != 0) {
				if(x + T <= M) { // 운동
					x = x + T;
					N--;
				} else {
					// 휴식
					x = Math.max(x - R, m);
				}
				minute++;
			}
			bw.write(minute+"");
		}
		bw.flush();
		
		bw.close();
		br.close();
	}
}
