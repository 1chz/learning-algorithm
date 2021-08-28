package baekjoon.string;

import java.io.IOException;

/**
 * @see <a href="https://www.acmicpc.net/problem/5622">
 * https://www.acmicpc.net/problem/5622
 * </a>
 */
public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int value;
        
        while(true) {
            value = System.in.read();
            
            if(value == '\n') {
                break;
            }
    
            if(value < 68) {
                count += 3;
            }
            else if(value < 71) {
                count += 4;
            }
            else if(value < 74) {
                count += 5;
            }
            else if(value < 77) {
                count += 6;
            }
            else if(value < 80) {
                count += 7;
            }
            else if(value < 84) {
                count += 8;
            }
            else if(value < 87) {
                count += 9;
            }
            else {
                count += 10;
            }
        }
        System.out.print(count);
    }
}
