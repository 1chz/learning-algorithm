package baekjoon.bronze100;

import static java.lang.String.valueOf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/10988">
 * https://www.acmicpc.net/problem/10988
 * </a>
 */
public class BOJ_10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = reverseString(s1);

        if (s1.equals(s2)) {
            bw.write(valueOf(1));
        } else {
            bw.write(valueOf(0));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c;
            for (int j = i + 1; j < chars.length; j++) {
                c = chars[j];
                chars[j] = chars[i];
                chars[i] = c;
            }
        }
        return new String(chars);
    }

}