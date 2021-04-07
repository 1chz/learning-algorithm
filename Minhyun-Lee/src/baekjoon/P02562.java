import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/2562">최댓값</a>
 */
public class P02562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number,
                max = 0,
                index = 0;
        for (int i = 0; i < 9; i++) {
            number = Integer.parseInt(br.readLine());

            if (max < number) {
                max = number;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}