package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10768">
 * https://www.acmicpc.net/problem/10768
 * </a>
 */
public class BOJ_10768 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = parseInt(br.readLine());
        int day = parseInt(br.readLine());
        LocalDate standard = LocalDate.of(2015, 2, 18);
        LocalDate date = LocalDate.of(2015, month, day);
        
        if (date.isEqual(standard)) {
            System.out.println("Special");
        }
        else if (date.isAfter(standard)) {
            System.out.println("After");
        }
        else {
            System.out.println("Before");
        }
        br.close();
    }
    
}