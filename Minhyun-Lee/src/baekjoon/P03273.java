package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/3273">두 수의 합</a>
 */
public class P03273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[] hasNumber = new boolean[1000001];
        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        int number, targetNumber;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(st.nextToken());
            targetNumber = x - number;

            if (number == targetNumber) continue;
            else if (targetNumber <= 0) continue;

            if (hasNumber[targetNumber]) {
                answer++;
                hasNumber[targetNumber] = false;
            } else {
                hasNumber[number] = true;
            }
        }

        System.out.println(answer);
    }
}