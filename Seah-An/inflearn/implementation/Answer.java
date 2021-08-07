package section.string.num3;

import java.util.Scanner;

public class Answer {
    public String solution(String str) {
        String answer = "";

        // 가장 작은 수로 초기화됨
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer a = new Answer();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(a.solution(str));
    }
}
