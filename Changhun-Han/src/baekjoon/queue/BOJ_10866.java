package src.baekjoon.queue;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10866">
 * https://www.acmicpc.net/problem/10866
 * </a>
 */
public class BOJ_10866 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();
        int iNum = 0;
        int N = parseInt(br.readLine());

        while (0 < N--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if ("push_front".equals(s)) {
                iNum = parseInt(st.nextToken());
                deque.addFirst(iNum);
            }
            else if ("push_back".equals(s)) {
                iNum = parseInt(st.nextToken());
                deque.addLast(iNum);
            }
            else if ("pop_front".equals(s)) {
                bw.write((deque.isEmpty() ? -1 : deque.pollFirst()) + "\n");
            }
            else if ("pop_back".equals(s)) {
                bw.write((deque.isEmpty() ? -1 : deque.pollLast()) + "\n");
            }
            else if ("size".equals(s)) {
                bw.write((deque.size()) + "\n");
            }
            else if ("empty".equals(s)) {
                bw.write((deque.isEmpty() ? 1 : 0) + "\n");
            }
            else if ("front".equals(s)) {
                bw.write((deque.isEmpty() ? -1 : deque.peekFirst()) + "\n");
            }
            else if ("back".equals(s)) {
                bw.write((deque.isEmpty() ? -1 : deque.peekLast()) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
