package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/14928">
 * https://www.acmicpc.net/problem/14928 큰 수 (BIG)
 * </a>
 */
public class BOJ_14928 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        long result = 0;
        for(int i = 0; i < str.length(); i++){
            result = (result * 10 + (str.charAt(i) - '0')) % 20000303;
        }

        System.out.println(result);
        br.close();
    }
}
