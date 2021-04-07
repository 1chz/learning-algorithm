import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="boj.kr/2309">일곱 난쟁이</a>
 */
public class P02309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] talls = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            talls[i] = Integer.parseInt(br.readLine());
            sum += talls[i];
        }
        Arrays.sort(talls);

        int temp;
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 9; j++) {
                temp = sum - (talls[i] + talls[j]);

                if (temp == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(talls[k]);
                    }

                    return;
                }
                temp = 0;
            }
        }
    }
}