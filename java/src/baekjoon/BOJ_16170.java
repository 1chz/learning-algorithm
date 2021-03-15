package baekjoon;

import java.time.LocalDateTime;

/**
 * @see <a href="https://www.acmicpc.net/problem/16170">
 * https://www.acmicpc.net/problem/16170
 * </a>
 */
public class BOJ_16170 {
    
    public static void main (String[] args) {
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getMonth().getValue());
        System.out.println(LocalDateTime.now().getDayOfMonth());
    }
    
}