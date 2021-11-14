package src.baekjoon.beginner100.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/9498">
 * https://www.acmicpc.net/problem/9498
 * </a>
 */
public class BOJ_9498 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalScore = parseInt(br.readLine());

        if (totalScore >= 90) {
            System.out.println("A");
        }
        else if (totalScore >= 80) {
            System.out.println("B");
        }
        else if (totalScore >= 70) {
            System.out.println("C");
        }
        else if (totalScore >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        br.close();
    }

}
