import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/2914">저작권</a>
 */
public class P02914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double i = Integer.parseInt(st.nextToken()) - 1;

        System.out.println(String.format("%.0f", Math.ceil(a * i) + 1));
    }
}