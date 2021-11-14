package src.baekjoon.beginner100.e;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/18108">
 * https://www.acmicpc.net/problem/18108
 * </a>
 */
public class BOJ_18108 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int beforeBuddha = Integer.parseInt(br.readLine());
        int beforeChrist = beforeBuddha - 543;
        System.out.println(beforeChrist);
        br.close();
    }

}
