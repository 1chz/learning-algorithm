package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int sum = 0;
            int studentCnt = Integer.parseInt(st.nextToken());
            int[] arr = new int[studentCnt];
            for (int j = 0; j < studentCnt; j++) {
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                arr[j] = score;
            }

            double avg = sum / studentCnt;

            double overAverageCnt = 0;
            for (int j = 0; j < studentCnt; j++) {
                if (arr[j] > avg) {
                    overAverageCnt++;
                }
            }

            sb.append(String.format("%.3f", (overAverageCnt / studentCnt * 100 * 1000) / 1000.0));
            sb.append("%");
            sb.append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
