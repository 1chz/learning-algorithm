package baekjoon.beginner100.c;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @see <a href="https://www.acmicpc.net/problem/10699">
 * https//www.acmicpc.net/problem/10699
 * </a>
 */
public class BOJ_10699 {
    
    public static void main (String[] args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
    
}