package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="boj.kr/1919">애너그램 만들기</a>
 */
public class P01919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        int[] word1Count = new int[26];
        int[] word2Count = new int[26];

        String word1 = br.readLine();
        String word2 = br.readLine();

        for (int i = 0; i < word1.length(); i++) {
            word1Count[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            word2Count[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            answer += Math.abs(word1Count[i] - word2Count[i]);
        }

        System.out.println(answer);
    }
}