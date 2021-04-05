package baekjoon.bronze100;

import java.io.*;
import java.util.stream.Stream;

/**
 * @see <a href="https://www.acmicpc.net/problem/1264">
 * https://www.acmicpc.net/problem/1264
 * </a>
 */
public class BOJ_1264 {
    
    private static int count;
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String s = br.readLine();
            count = 0;
            
            if(s.equals("#")) {
                break;
            }
            
            Stream.of(s.split(""))
                  .forEach(o -> {
                      if(o.matches("^[aeiouAEIOU]*$")) {
                          count++;
                      }
                  });
            
            sb.append(count + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}