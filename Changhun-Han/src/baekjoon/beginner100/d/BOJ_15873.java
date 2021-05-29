package baekjoon.beginner100.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/15873">
 * https://www.acmicpc.net/problem/15873
 * </a>
 */
public class BOJ_15873 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        if (length == 2) {
            System.out.print(parseInt(str.substring(0, 1)) + parseInt(str.substring(1, 2)));
        }
        else if (length == 3 && str.charAt(1) == '1') {
            System.out.print(parseInt(str.substring(0, 1)) + parseInt(str.substring(1, length)));
        }
        else {
            System.out.print(parseInt(str.substring(0, 2)) + parseInt(str.substring(2, length)));
        }
        br.close();
    }
    
}