package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2869">
 * https://www.acmicpc.net/problem/2869 달팽이는 올라가고 싶다
 * </a>
 */
public class BOJ_2869 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read = br.readLine().split(" ");
		int A = Integer.parseInt(read[0]); // 낮에 올라가는 높이
		int B = Integer.parseInt(read[1]); // 밤에 내려가는 높이
		int V = Integer.parseInt(read[2]); // 올라가야할 높이
		br.close();
		
		int height = V - B; // 꼭대기 도달 순간 높이 (미끄러지지 않으니 -B)
		int day = height / (A - B);
		if(height % (A - B) != 0) { // 올라가야할 높이가 남았음
            day++;
        }
	        
		System.out.println(day);
	}
}
