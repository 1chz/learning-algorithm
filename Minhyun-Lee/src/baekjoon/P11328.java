package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/11328">Strfry</a>
 */
public class P11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[] origin, changed;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            origin = st.nextToken().split("");
            changed = st.nextToken().split("");

            Arrays.sort(origin);
            Arrays.sort(changed);

            System.out.println(Arrays.equals(origin, changed) ? "Possible" : "Impossible");
        }
    }
}