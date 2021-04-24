package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2828">
 * https://www.acmicpc.net/problem/2828
 * </a>
 */
public class BOJ_2828 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        int J = parseInt(br.readLine());
        
        int startPoint = 1;
        int endPoint = M;
        int count = 0;
        
        for(int dropApple = 0; dropApple < J; dropApple++) {
            
            int dropPoint = parseInt(br.readLine());
            
            if(startPoint <= dropPoint && dropPoint <= endPoint) {
                continue;
            }
            
            if(dropPoint < startPoint) {
                int temp = startPoint - dropPoint;
                count += temp;
                startPoint = dropPoint;
                endPoint -= temp;
            }
            
            else if(dropPoint > endPoint) {
                int temp = dropPoint - endPoint;
                count += temp;
                startPoint += temp;
                endPoint = dropPoint;
            }
        }
        
        System.out.println(count);
    }
    
}