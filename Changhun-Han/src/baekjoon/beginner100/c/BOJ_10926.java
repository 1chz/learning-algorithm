package src.baekjoon.beginner100.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10926">
 * https//www.acmicpc.net/problem/10926
 * </a>
 */
public class BOJ_10926 {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(br.readLine())
                     .append("??!");
        System.out.println(stringBuilder);
        br.close();
    }

}
