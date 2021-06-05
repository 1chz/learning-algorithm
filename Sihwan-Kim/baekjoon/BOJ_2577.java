package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2577">
 *      https://www.acmicpc.net/problem/2577 </a>
 */
public class BOJ_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		while (val != 0) {
			arr[val%10]++;
			val/=10;
		}
		
		for(int rs : arr) {
			System.out.println(rs);
		}
	}
}