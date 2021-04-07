import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/10804">카드역배치</a>
 */
public class P10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] cards = new int[21];
        for (int i = 1; i <= 20; i++) {
            cards[i] = i;
        }

        int start,
                end,
                temp;
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            for (int j = 0; j < ((end - start) / 2) + 1; j++) {
                temp = cards[start + j];
                cards[start + j] = cards[end - j];
                cards[end - j] = temp;
            }
        }

        for (int i = 1; i <= 20; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}