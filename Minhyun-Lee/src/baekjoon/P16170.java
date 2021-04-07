import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

/**
 * @see <a href="boj.kr/P16170">오늘의 날짜는?</a>
 */
public class P16170 {
    public static void main(String[] args) throws IOException {
        LocalDate utcDate = LocalDate.now(ZoneId.of("UTC"));

        System.out.println(utcDate.getYear());
        System.out.println(String.format("%02d" ,utcDate.getMonthValue()));
        System.out.println(utcDate.getDayOfMonth());
    }
}