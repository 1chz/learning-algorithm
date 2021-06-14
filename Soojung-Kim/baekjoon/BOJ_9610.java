package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());

            if (N1 == 0 || N2 == 0) {
                axis++;
            } else if (N1 > 0) {
                if (N2 > 0) {
                    q1++;
                } else {
                    q4++;
                }
            } else {
                if (N2 > 0) {
                    q2++;
                } else {
                    q3++;
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append("Q1: ");
        sb.append(q1);
        sb.append("\n");
        sb.append("Q2: ");
        sb.append(q2);
        sb.append("\n");
        sb.append("Q3: ");
        sb.append(q3);
        sb.append("\n");
        sb.append("Q4: ");
        sb.append(q4);
        sb.append("\n");
        sb.append("AXIS: ");
        sb.append(axis);

        System.out.println(sb);

        br.close();
    }
}
