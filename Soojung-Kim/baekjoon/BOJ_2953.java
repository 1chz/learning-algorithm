package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2953 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int winner = 0;
        int score = 0;

        for (int i = 1; i <= 5; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int eachScore = 0;
            for (int j = 0; j < 4; j++) {
                eachScore += Integer.parseInt(st.nextToken());
            }

            if (winner == 0 || score < eachScore) {
                winner = i;
                score = eachScore;
            }
        }

        System.out.println(winner + " " + score);

        br.close();
    }
}
