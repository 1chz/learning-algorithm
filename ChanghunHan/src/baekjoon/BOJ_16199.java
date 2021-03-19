package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/16199">
 * https://www.acmicpc.net/problem/16199
 * </a>
 */
public class BOJ_16199 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] birthDay = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] standardDay = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        
        if (standardDay[1] - birthDay[1] > 0) {
            System.out.println(standardDay[0] - birthDay[0]);
        }
        else if (standardDay[1] - birthDay[1] < 0) {
            System.out.println(standardDay[0] - birthDay[0] - 1);
        }
        else {
            if (standardDay[2] - birthDay[2] >= 0) {
                System.out.println(standardDay[0] - birthDay[0]);
            }
            else {
                System.out.println(standardDay[0] - birthDay[0] - 1);
            }
        }
        System.out.println(standardDay[0] - birthDay[0] + 1);
        System.out.println(standardDay[0] - birthDay[0]);
        sc.close();
    }
    
}