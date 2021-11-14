package src.baekjoon.bronze100.c;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Collections.sort;

/**
 * @see <a href="https://www.acmicpc.net/problem/2750">
 * https://www.acmicpc.net/problem/2750
 * </a>
 */
public class BOJ_2750 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        while(0 < N--) {
            int num = parseInt(br.readLine());
            list.add(num);
        }

        sort(list);

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
