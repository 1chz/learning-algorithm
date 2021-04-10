import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/1001">A-B</a>
 */
public class P01001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
    }
}