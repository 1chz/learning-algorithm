package baekjoon;

import java.io.*;
import java.util.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/1931">
 * https://www.acmicpc.net/problem/1931 회의실 배정
 * </a>
 * 참고 https://st-lab.tistory.com/145
 */
public class BOJ_1931 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		// 회의가 빨리 끝나는 순으로 정렬하기
		int endTime = 0;
		int cnt = 0;
		int[][] conference = new int[n][2];
		for (int i = 0; i < n; i++) {
			String[] read = br.readLine().split(" ");
			conference[i][0] = Integer.parseInt(read[0]);
			conference[i][1] = Integer.parseInt(read[1]);
		}
		br.close();
		
		Arrays.sort(conference, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료 시간이 같을 경우 시작 시간이 빠른 순
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		for (int i = 0; i < n; i++) {
			if(conference[i][0] >= endTime) {
				cnt++;
				endTime = conference[i][1];
			}
		}
		
		System.out.println(cnt);
	}
}
