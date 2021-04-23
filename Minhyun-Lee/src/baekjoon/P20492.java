import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/20492">세금</a>
 */
public class P20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long prize = Integer.parseInt(st.nextToken());

        System.out.println(String.format("%.0f %.0f" ,
                prize * .78,
                prize - ((prize * .2) * .22)));
    }
}