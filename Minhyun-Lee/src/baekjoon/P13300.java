package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/13300">방 배정</a>
 */
public class P13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int students[][] = new int[7][2];
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int gender, grade;
        int room = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            gender = Integer.parseInt(st.nextToken());
            grade = Integer.parseInt(st.nextToken());

            students[grade][gender]++;
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 1; j++) {
                if (students[i][j] % k != 0) {
                    room++;
                }

                room += students[i][j] / k;
            }
        }

        System.out.println(room);
    }
}