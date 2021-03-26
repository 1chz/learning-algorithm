package baekjoon;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @see <a href="https://www.acmicpc.net/problem/16170">
 * https://www.acmicpc.net/problem/16170 오늘의 날짜는?
 * </a>
 */
public class BOJ_16170 {

    public static void main(String[] args) throws IOException {
        LocalDateTime utcNow = LocalDateTime.now(ZoneOffset.UTC);

        System.out.println(utcNow.getYear());
        System.out.println(utcNow.getMonth().getValue());
        System.out.println(utcNow.getDayOfMonth());
    }
}
