import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/3003">킹, 퀸, 룩, 비숍, 나이트, 폰</a>
 */
public class P03003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chessSetCount = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < chessSetCount.length; i++) {
            chessSetCount[i] -= Integer.parseInt(st.nextToken());
            System.out.printf("%d ", chessSetCount[i]);
        }
    }
}