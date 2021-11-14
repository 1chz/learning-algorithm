package src.baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1966">
 * https://www.acmicpc.net/problem/1966
 * </a>
 */
public class BOJ_1966 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int TC = parseInt(br.readLine());

        while(0 < TC--) {
            LinkedList<int[]> queue = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = parseInt(st.nextToken());
            int docs = parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                queue.add(new int[] {i, parseInt(st.nextToken())});
            }

            int count = 0;

            while(true) {

                int[] first = queue.poll();
                boolean isMax = false;

                for(int i = 0; i < queue.size(); i++) {

                    if(queue.get(i)[1] > first[1]) {
                        queue.add(first);

                        for(int j = 0; j < i; j++) {
                            queue.add(queue.poll());
                        }

                        isMax = true;
                        break;
                    }
                }

                if(isMax) {
                    continue;
                }

                count++;

                if(first[0] == docs) {
                    break;
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
