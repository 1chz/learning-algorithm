package src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2845">
 * https://www.acmicpc.net/problem/2845
 * </a>
 */
public class BOJ_2845 {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int human = sc.nextInt() * sc.nextInt();
        stringBuilder.append(( sc.nextInt() - human ))
                     .append(" ")
                     .append(( sc.nextInt() - human ))
                     .append(" ")
                     .append(( sc.nextInt() - human ))
                     .append(" ")
                     .append(( sc.nextInt() - human ))
                     .append(" ")
                     .append(( sc.nextInt() - human ));
        System.out.println(stringBuilder);
        sc.close();
    }

}
