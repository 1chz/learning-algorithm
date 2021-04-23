import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/2577">숫자의 개수</a>
 */
public class P02577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numCount = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result = String.valueOf(a * b * c);

        for (int i = 0; i < result.length(); i++) {
            ++numCount[result.charAt(i) - '0'];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numCount[i]);
        }
    }
}