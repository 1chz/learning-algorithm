package baekjoon;

import java.io.*;

public class Main_1075 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		int cnt = n - (n % 100); // 00부터 시작
		for (int i = 0; i < 100; i++) {
			if(cnt % f == 0) {
				bw.write(String.format("%02d", i));
				break;
			}
			cnt++;
		}
		bw.flush();
		
		bw.close();
		br.close();
	}

}
