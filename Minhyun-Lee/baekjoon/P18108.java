import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/18108">1998년생인 내가 태국에서는 2541년생?!</a>
 */
public class P18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int thaiYears = Integer.parseInt(br.readLine());

        System.out.println(thaiYears - 543);
    }
}
