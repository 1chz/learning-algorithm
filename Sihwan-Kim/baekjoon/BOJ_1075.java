package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1075">
 *      https://www.acmicpc.net/problem/1075 </a>
 */
public class BOJ_1075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int F = Integer.parseInt(br.readLine());
		
		N = (N/100) * 100;
		
		while(N%F != 0) N++;
		
		
		N%=100;
		
		if(N<10) System.out.println("0"+N);
		else System.out.println(N);
	}
}