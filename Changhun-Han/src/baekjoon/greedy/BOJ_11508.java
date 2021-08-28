package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.sort;
import static java.util.Arrays.stream;
import static java.util.Collections.reverseOrder;

/**
 * @see <a href="https://www.acmicpc.net/problem/11508">
 * https://www.acmicpc.net/problem/11508
 * </a>
 */
public class BOJ_11508 {
    
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = parseInt(br.readLine());
            
            Integer[] products = new Integer[N];
            for(int i = 0; i < products.length; i++) {
                products[i] = parseInt(br.readLine());
            }
            
            sort(products, reverseOrder());
            
            int pointer = N / 3;
            for(int i = 2, j = 0; j < pointer; i += 3, j++) {
                products[i] = 0;
            }
            
            Integer result = stream(products).reduce(Integer::sum).get();
            System.out.println(result);
        }
    }
    
}