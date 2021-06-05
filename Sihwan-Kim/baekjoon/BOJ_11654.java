package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11654">
 *      https://www.acmicpc.net/problem/11654 </a>
 */
public class BOJ_11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputTxt = br.readLine();
		
		char charAt = inputTxt.charAt(0);
		System.out.println((int) charAt);
	}
}