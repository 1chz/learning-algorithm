package ChanghunHan.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/14681">
 * https://www.acmicpc.net/problem/14681
 * </a>
 */
public class BOJ_14681 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = parseInt(br.readLine());
        int y = parseInt(br.readLine());
        
        if (x > 0 && y > 0) {
            System.out.println("1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("4");
        }
        br.close();
    }
    
}