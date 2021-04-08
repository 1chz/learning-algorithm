package baekjoon.bronze100;

import java.io.*;
import java.util.stream.Stream;

/**
 * @see <a href="https://www.acmicpc.net/problem/3009">
 * https://www.acmicpc.net/problem/3009
 * </a>
 */
public class BOJ_3009 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] point1 = Stream.of(br.readLine().split(" "))
                             .mapToInt(Integer :: parseInt)
                             .toArray();
        
        int[] point2 = Stream.of(br.readLine().split(" "))
                             .mapToInt(Integer :: parseInt)
                             .toArray();
        int[] point3 = Stream.of(br.readLine().split(" "))
                             .mapToInt(Integer :: parseInt)
                             .toArray();
        
        int X, Y;
        
        if(point1[0] == point2[0]) {
            X = point3[0];
        }
        else if(point1[0] == point3[0]) {
            X = point2[0];
        }
        else {
            X = point1[0];
        }
        
        if(point1[1] == point2[1]) {
            Y = point3[1];
        }
        else if(point1[1] == point3[1]) {
            Y = point2[1];
        }
        else {
            Y = point1[1];
        }
        
        bw.write(X + " " + Y);
        bw.flush();
        bw.close();
        br.close();
    }
    
}