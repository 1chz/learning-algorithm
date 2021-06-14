package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1076 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ans = "";
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                ans = String.valueOf(Long.parseLong(ans) * Long.parseLong(calc(br.readLine(), i)));
            } else {
                ans += calc(br.readLine(), i);
            }
        }

        System.out.println(ans);
        br.close();
    }

    static String calc(String s, int state) {
        if (s.equals("black")) {
            if (state == 2) {
                return "1";
            } else {
                return "0";
            }
        } else if (s.equals("brown")) {
            if (state == 2) {
                return "10";
            } else {
                return "1";
            }
        } else if (s.equals("red")) {
            if (state == 2) {
                return "100";
            } else {
                return "2";
            }
        } else if (s.equals("orange")) {
            if (state == 2) {
                return "1000";
            } else {
                return "3";
            }
        } else if (s.equals("yellow")) {
            if (state == 2) {
                return "10000";
            } else {
                return "4";
            }
        } else if (s.equals("green")) {
            if (state == 2) {
                return "100000";
            } else {
                return "5";
            }
        } else if (s.equals("blue")) {
            if (state == 2) {
                return "1000000";
            } else {
                return "6";
            }
        } else if (s.equals("violet")) {
            if (state == 2) {
                return "10000000";
            } else {
                return "7";
            }
        } else if (s.equals("grey")) {
            if (state == 2) {
                return "100000000";
            } else {
                return "8";
            }
        } else {
            if (state == 2) {
                return "1000000000";
            } else {
                return "9";
            }
        }
    }
}
