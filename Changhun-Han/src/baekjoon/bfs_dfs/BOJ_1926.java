package src.baekjoon.bfs_dfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1926">
 * https://www.acmicpc.net/problem/1926
 * </a>
 */
public class BOJ_1926 {
    
    //TODO
    private static Queue<Point> q;
    private static int[][] map;
    private static boolean[][] vis;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {1, 0, -1, 0};
    
    private static int x;
    private static int y;
    private static int pictures = 0;
    private static int widePicture = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        x = parseInt(st.nextToken());
        y = parseInt(st.nextToken());
        
        map = new int[x][y];
        vis = new boolean[x][y];
        
        for(int i = 0; i < x; i++) {
            String s = br.readLine();
            for(int j = 0; j < y; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(map[i][j] == 1 && !vis[i][j]) {
                    bfs(new Point(i, j));
                }
            }
        }
        bw.write(pictures);
        bw.write("\n");
        bw.write(widePicture);
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void bfs(Point point) {
        
        q = new LinkedList<>();
        q.add(point);
        
        int area = 0;
        while(!q.isEmpty()) {
            area++;
            Point p = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx < 0 || nx >= x || ny < 0 || ny >= y) {
                    continue;
                }
                if(vis[nx][ny] || map[nx][ny] != 1) {
                    continue;
                }
                vis[nx][ny] = true;
                q.add(new Point(nx, ny));
            }
        }
        pictures++;
        if(area > 1) {
            area--;
        }
        widePicture = Math.max(widePicture, area);
        
    }
    
    private static class Point {
        
        int x;
        int y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
    }
    
}


