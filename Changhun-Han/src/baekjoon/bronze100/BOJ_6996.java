package baekjoon.bronze100;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/6996">
 * https://www.acmicpc.net/problem/6996
 * </a>
 */
public class BOJ_6996 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        while(0 < N--) {
            String[] strings = br.readLine().split(" ");
            
            if(isAnagram(strings)) {
                sb.append(strings[0] + " & " + strings[1] + " are anagrams.\n");
            }
            else {
                sb.append(strings[0] + " & " + strings[1] + " are NOT anagrams.\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static boolean isAnagram (String[] strings) {
        String s1 = Stream.of(strings[0].split("")).sorted().collect(Collectors.joining());
        String s2 = Stream.of(strings[1].split("")).sorted().collect(Collectors.joining());
        return s1.equals(s2);
    }
    
}