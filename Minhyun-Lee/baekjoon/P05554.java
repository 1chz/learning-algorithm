import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/5554">심부름 가는 길</a>
 */
public class P05554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int seconds = 0;

        for(int i = 0; i < 4; i++) {
            seconds += Integer.parseInt(br.readLine());
        }

        System.out.println(seconds / 60);
        System.out.println(seconds % 60);
    }
}
