import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/1001">A-B</a>
 */
public class P02753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}