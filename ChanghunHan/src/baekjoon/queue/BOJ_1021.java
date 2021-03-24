package baekjoon.queue;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1021">
 * https://www.acmicpc.net/problem/1021
 * </a>
 */
public class BOJ_1021 {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        int answer = 0;
        int num;
        
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < M; i++) {
            num = parseInt(st.nextToken());
            boolean flag = true;
            while (flag) {
                if (list.get(0) == num) {
                    list.remove(0);
                    flag = false;
                }
                else {
                    if (list.indexOf(num) <= list.size() / 2) {
                        list.add(list.size() - 1, list.remove(0));
                    }
                    else {
                        list.add(0, list.remove(list.size() - 1));
                    }
                    answer++;
                }
            }
        }
        
        bw.write(Integer.toString(answer));
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}