import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/2576">홀수</a>
 */
public class P02576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number,
                min = Integer.MAX_VALUE,
                sum = 0;
        for (int i = 0; i < 7; i++) {
            number = Integer.parseInt(br.readLine());

            if (number % 2 != 0) {
                sum += number;
                min = Math.min(min, number);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}