package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2752">
 * https://www.acmicpc.net/problem/2752
 * </a>
 */
public class BOJ_2752 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = {parseInt(st.nextToken()),
                      parseInt(st.nextToken()),
                      parseInt(st.nextToken())};
        
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        br.close();
    }
    
}