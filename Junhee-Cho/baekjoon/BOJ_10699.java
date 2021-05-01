package baekjoon;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @see <a href="https://www.acmicpc.net/problem/10699">
 * https://www.acmicpc.net/problem/10699 오늘 날짜
 * </a>
 */
public class BOJ_10699 {

    public static void main(String[] args) throws IOException {
        final LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
