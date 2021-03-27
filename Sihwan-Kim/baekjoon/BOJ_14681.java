package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/14681">
 * https://www.acmicpc.net/problem/14681
 * </a>
 */
public class BOJ_14681 {
    public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[2];
		for (int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(arr[0] > 0 && arr[1] > 0) {
			System.out.println(1);
		} else if(arr[0] < 0 && arr[1] > 0) {
			System.out.println(2);
		} else if(arr[0] < 0 && arr[1] < 0) {
			System.out.println(3);
		} else if(arr[0] > 0 && arr[1] < 0) {
			System.out.println(4);
		}
	}
    }
}