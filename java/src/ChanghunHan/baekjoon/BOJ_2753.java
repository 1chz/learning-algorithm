package ChanghunHan.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2753">
 * https://www.acmicpc.net/problem/2753
 * </a>
 */
public class BOJ_2753 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = parseInt(br.readLine());
        
        if (year < 1 || year > 4000) {
            System.out.println("잘못 입력하셨습니다.");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("1");
        }
        else if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
        br.close();
    }
    
}