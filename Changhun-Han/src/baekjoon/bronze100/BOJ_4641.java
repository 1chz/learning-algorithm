package baekjoon.bronze100;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/4641">
 * https://www.acmicpc.net/problem/4641
 * </a>
 */
public class BOJ_4641 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] list = new int[st.countTokens()];
            
            for(int i = 0; i < list.length; i++) {
                list[i] = parseInt(st.nextToken());
            }
            
            if(list[0] == -1) {
                break;
            }
            else {
                for(int i = 0; i < list.length; i++) {
                    if(list[i] == 0) {
                        break;
                    }
                    int num = list[i] * 2;
                    for(int j = 0; j < list.length; j++) {
                        if(num == list[j]) {
                            result++;
                        }
                    }
                }
                sb.append(result + "\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}