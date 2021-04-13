package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/1158">요세푸스 문제</a>
 */
public class P01158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int index = k - 1;
        List<Integer> seats = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            seats.add(i);
        }

        sb.append("<");
        while (seats.size() != 1) {
            sb.append(seats.get(index));
            sb.append(", ");
            seats.remove(index);

            index = (index + (k - 1)) % seats.size();
        }
        sb.append(seats.get(0));
        sb.append(">");

        System.out.println(sb.toString());
    }
}