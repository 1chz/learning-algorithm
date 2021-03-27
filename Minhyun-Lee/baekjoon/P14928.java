import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/14928">큰 수(BIG)</a>
 */
public class P14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();

        long remains = 0;
        for (int i = 0; i < number.length(); i++) {
            remains = ((remains * 10) + (number.charAt(i) - '0')) % 20000303;
        }

        System.out.println(remains);
    }
}