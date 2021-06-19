package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());

            int tmp = 1;
            for (int j = 0; j < N2; j++) {
                tmp = tmp * N1 % 10;
            }

            if (tmp == 0) {
                System.out.println(10);
            } else {
                System.out.println(tmp);
            }
        }

        br.close();
    }
}
