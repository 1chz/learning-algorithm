package baekjoon.bronze100.c;

import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2851">
 * https://www.acmicpc.net/problem/2851
 * </a>
 */
public class BOJ_2851 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] mushrooms = new int[10];
        int[] scores = new int[10];
        int score = 0;

        for (int i = 0; i < 10; i++) {
            mushrooms[i] = parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            score += mushrooms[i];
            scores[i] = score;
            if (score >= 100) {
                break;
            }
        }

        Arrays.sort(scores);

        int o1 =
                100 - scores[scores.length - 1] < 0 ?
                        scores[scores.length - 1] - 100
                        :
                                100 - scores[scores.length - 1];

        int o2 =
                100 - scores[scores.length - 2] < 0 ?
                        scores[scores.length - 2] - 100
                        :
                                100 - scores[scores.length - 2];

        if (o1 == o2 || o1 < o2) {
            sb.append(scores[scores.length - 1] + "\n");
        }
        else {
            sb.append(scores[scores.length - 2] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}



