import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/1267">핸드폰 요금</a>
 */
public class P01267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int time,
                y = 0,
                m = 0;
        for (int i = 0; i < n; i++) {
            time = Integer.parseInt(st.nextToken());
            y += ((time / 30) + 1) * 10;
            m += ((time / 60) + 1) * 15;
        }

        if (y == m) {
            System.out.println(String.format("Y M %d", y));
        } else if (y < m) {
            System.out.println(String.format("Y %d", y));
        } else {
            System.out.println(String.format("M %d", m));
        }
    }
}