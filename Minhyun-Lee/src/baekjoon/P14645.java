import java.io.*;
import java.util.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/14645">와이버스 부릉부릉</a>
 */
public class P14645 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            br.readLine();
        }

        System.out.println("비와이");
    }
}
