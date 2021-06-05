package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/1373">
 * https://www.acmicpc.net/problem/1373 2진수 8진수
 * </a>
 */
public class BOJ_1373 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read = br.readLine().split("");
		br.close();
		
		StringBuilder builder = new StringBuilder();
		for (int i = read.length-1; i >= 0;) {
			int a = 0; // 0~7
			for (int j = 0; j < 3; j++) {
				String str = read[i--];
				a += Integer.parseInt(str) * Math.pow(2, j);
				if(i < 0) break;
			}
			builder.append(a);
		}
		
		System.out.println(builder.reverse().toString());
		
		
		// 풀고 난 뒤 참고 소스
//		String str = new String(br.readLine());
//		if(str.length() % 3 == 1) {
//			sb.append(str.charAt(0));
//		}
//		else if(str.length() %3 == 2 ) {
//			sb.append((str.charAt(0)-'0')*2 + (str.charAt(1)-'0'));
//		}
//		for(int i= str.length()%3; i<str.length(); i+=3) {
//			sb.append((str.charAt(i)-'0')*4+ (str.charAt(i+1)-'0')*2 + (str.charAt(i+2)-'0'));
//		}
		
	}
}
