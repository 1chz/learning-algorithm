import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/2480">주사위</a>
 */
public class P02480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[7];
        for (int i = 0; i < 3; i++) {
            numbers[Integer.parseInt(st.nextToken())] += 1;
        }

        int finNum = 0;
        for (int i = 1; i <= 6; i++) {
            if (numbers[i] == 3) {
                System.out.println(10000 + i * 1000);
                return;
            } else if (numbers[i] == 2) {
                System.out.println(1000 + i * 100);
                return;
            } else if (numbers[i] == 1) {
                finNum = i;
            }
        }

        System.out.println(finNum * 100);
        return;
    }
}