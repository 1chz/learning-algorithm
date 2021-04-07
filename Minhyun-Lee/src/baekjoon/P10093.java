import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/10093">숫자</a>
 */
public class P10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] numbers = new long[2];

        numbers[0] = Long.parseLong(st.nextToken());
        numbers[1] = Long.parseLong(st.nextToken());

        Arrays.sort(numbers);

        long distance = numbers[1] - numbers[0];
        System.out.println(distance == 0 ? 0 : distance - 1);
        for (int i = 1; i < distance; i++) {
            System.out.print((numbers[0] + i) + " ");
        }
    }
}