package src.baekjoon.beginner100.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/5575">
 * https://www.acmicpc.net/problem/5575
 * </a>
 */
public class BOJ_5575 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        String[] str3 = br.readLine().split(" ");
        
        LocalTime A = LocalTime.of(parseInt(str1[3]), parseInt(str1[4]), parseInt(str1[5]))
                               .minusHours(parseInt(str1[0]))
                               .minusMinutes(parseInt(str1[1]))
                               .minusSeconds(parseInt(str1[2]));
        
        LocalTime B = LocalTime.of(parseInt(str2[3]), parseInt(str2[4]), parseInt(str2[5]))
                               .minusHours(parseInt(str2[0]))
                               .minusMinutes(parseInt(str2[1]))
                               .minusSeconds(parseInt(str2[2]));
        
        LocalTime C = LocalTime.of(parseInt(str3[3]), parseInt(str3[4]), parseInt(str3[5]))
                               .minusHours(parseInt(str3[0]))
                               .minusMinutes(parseInt(str3[1]))
                               .minusSeconds(parseInt(str3[2]));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m s");
        System.out.println(formatter.format(A));
        System.out.println(formatter.format(B));
        System.out.println(formatter.format(C));
        
        br.close();
    }
    
}
