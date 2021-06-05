package BOJ;

/**
 * @see <a href="https://www.acmicpc.net/problem/15596">
 *      https://www.acmicpc.net/problem/15596 </a>
 */
public class BOJ_15596 {
	class Test {
		long sum(int[] a) {
			long sum = 0;
			for (int val : a) {
				sum += val;
			}
			return sum;
		}
	}
}