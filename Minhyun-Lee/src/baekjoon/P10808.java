package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/10808">알파벳 개수</a>
 */
public class P10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}