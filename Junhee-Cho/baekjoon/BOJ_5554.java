package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

/**
 * @see <a href="https://www.acmicpc.net/problem/5554">
 * https://www.acmicpc.net/problem/5554 심부름 가는 길
 * </a>
 */
public class BOJ_5554 {

    public static void main(String[] args) throws IOException {
        final int LINE_COUNT = 4;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumOfSecound = sumOfSecond(br, LINE_COUNT);
        CustomTime result = parseSecoundToMinuteSecond(sumOfSecound);
        System.out.println(result);
        br.close();
    }

    private static CustomTime parseSecoundToMinuteSecond(int seconds) {
        long minute = TimeUnit.SECONDS.toMinutes(seconds);
        long restSecond = seconds - TimeUnit.MINUTES.toSeconds(minute);
        return new CustomTime(minute, restSecond);
    }

    private static int sumOfSecond(BufferedReader br, int lineCount) throws IOException {
        int sum = 0;
        for (int i=0; i < lineCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken());
        }
        return sum;
    }

}

class CustomTime {
    private long minutes;
    private long second;

    public CustomTime(long minute, long second) {
        this.minutes = minute;
        this.second = second;
    }

    public long getMinutes() {
        return minutes;
    }

    public long getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return minutes + "\n" + second;
    }
}
