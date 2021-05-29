package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11399">
 * https://www.acmicpc.net/problem/11399
 * </a>
 */
public class BOJ_11399 {
    
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int[] N = {parseInt(br.readLine())};
            int result = Arrays.stream(br.readLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .sorted()
                               .reduce(0, (a, b)->a + (N[0]-- * b));
            
            System.out.println(result);
        }
    }
    
    private void stream() throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            
            AtomicInteger ai = new AtomicInteger();
            int result = Arrays.stream(br.readLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .sorted()
                               .map(ai::addAndGet)
                               .reduce(Integer::sum)
                               .getAsInt();
            
            System.out.println(result);
        }
    }
    
    private void countingSort() throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] inputs = new int[N + 1];
            while(N-- > 0) {
                inputs[parseInt(st.nextToken())]++;
            }
            
            int time = 0;
            int result = 0;
            for(int i = 0; i < inputs.length; i++) {
                while(inputs[i]-- > 0) {
                    result += i + time;
                    time += i;
                }
            }
            System.out.println(result);
        }
    }
    
}