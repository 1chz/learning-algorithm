package baekjoon.bronze100.b;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2456">
 * https://www.acmicpc.net/problem/2456
 * </a>
 */
public class BOJ_2456 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        int[][] scoreList = new int[N][3];
        
        int A = 0;
        int aScore = 0;
        int B = 0;
        int bScore = 0;
        int C = 0;
        int cScroe = 0;
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                scoreList[i][j] = parseInt(st.nextToken());
                if(j == 0) {
                    A += scoreList[i][j];
                    aScore += scoreList[i][j] * scoreList[i][j];
                }
                if(j == 1) {
                    B += scoreList[i][j];
                    bScore += scoreList[i][j] * scoreList[i][j];
                }
                if(j == 2) {
                    C += scoreList[i][j];
                    cScroe += scoreList[i][j] * scoreList[i][j];
                }
            }
        }
        if(aScore == bScore && bScore == cScroe) {
            sb.append("0 " + A + "\n");
        }
        else if(aScore > bScore && aScore > cScroe) {
            sb.append("1 " + A + "\n");
        }
        else if(bScore > aScore && bScore > cScroe) {
            sb.append("2 " + B + "\n");
        }
        else if(cScroe > aScore && cScroe > bScore) {
            sb.append("3 " + C + "\n");
        }
        else if(aScore == bScore || aScore == cScroe) {
            sb.append("0 " + A + "\n");
        }
        else if(bScore == cScroe) {
            sb.append("0 " + B + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}