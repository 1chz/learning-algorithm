package baekjoon.beginner100;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * @see <a href="https://www.acmicpc.net/problem/15923">
 * https://www.acmicpc.net/problem/15923
 * </a>
 */
public class BOJ_15923 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] points = new Point[N];
        
        int total = 0;
        
        for (int i = 0; i < N; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        
        for (int i = 0; i < N - 1; i++) {
            total += abs(points[i].x - points[i + 1].x);
            total += abs(points[i].y - points[i + 1].y);
            if (i == N - 2) {
                total += abs(points[0].x - points[i + 1].x);
                total += abs(points[0].y - points[i + 1].y);
            }
        }
        
        System.out.println(total);
        
        sc.close();
    }
    
    public static class Point {
        
        int x;
        int y;
        
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
        
    }
    
}