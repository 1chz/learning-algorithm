import java.io.*;
import java.util.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/5522">카드 게임</a>
 */
public class P05522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);
    }
}
