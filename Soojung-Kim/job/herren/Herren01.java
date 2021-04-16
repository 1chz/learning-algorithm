package job.herren;

import java.util.Arrays;

/**
 * ### 1. 한글 문장 정렬
 *
 * 한글 문장을 정렬하라.
 * input) 우리나라만세
 * output) 나라리만세우
 */
public class Herren01 {

    public static void main(String[] args) {
        String str = "우리나라만세";

        char[] chs = str.toCharArray();

        Arrays.sort(chs);
        System.out.println(String.valueOf(chs));
    }
}
