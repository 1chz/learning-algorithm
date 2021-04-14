package baekjoon.queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/3190">
 * https://www.acmicpc.net/problem/3190
 * </a>
 */
public class BOJ_3190 {
    
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static StringBuilder sb;
    
    private static Deque<Point> snake = new ArrayDeque<>();
    
    private static int N;
    private static int K;
    private static int L;
    
    /**
     * Map 구조 <br/>
     * ■ = 벽 <br/>
     * □ = 빈땅 <br/>
     * <br/>
     * N = 3 <br/>
     * ■■■■■ <br/>
     * ■□□□■ <br/>
     * ■□□□■ <br/>
     * ■□□□■ <br/>
     * ■■■■■ <br/>
     * <br/>
     * 0 : 아무것도 없음 <br/>
     * 1 : 사과 <br/>
     * 2 : 뱀 <br/>
     */
    private static int[][] map;
    private static int[] secList;
    private static int[] dirList;
    
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    
    private static int direction = 1;
    private static int second = 0;
    private static int result = 0;
    
    //----------------------------- Dummy -----------------------------//
    
    public static void main (String[] args) throws Exception {
        init();
        solution();
        print();
    }
    
    //----------------------------- init -----------------------------//
    
    private static void init () throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        
        N = parseInt(br.readLine());
        K = parseInt(br.readLine());
        map = new int[N + 2][N + 2];
        
        // todo 사과 위치
        for(int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = parseInt(st.nextToken());
            int y = parseInt(st.nextToken());
            map[x][y] = 1;
        }
        
        L = parseInt(br.readLine());
        secList = new int[L];
        dirList = new int[L];
        
        // todo 시간, 방향 정보
        for(int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            secList[i] = parseInt(st.nextToken());
            dirList[i] = getDirection(st.nextToken());
        }
        
        // todo 시작 방향은 오른쪽
        map[1][1] = 2;
        
        // todo 시작 위치는 (1,1)
        snake.add(new Point(1, 1));
    }
    
    //----------------------------- solution -----------------------------//
    
    private static void solution () {
        while(true) {
            setDirection();
            
            int x = moveToX();
            int y = moveToY();
            
            if(isWall(x, y)) {
                sb.append(result + 1);
                break;
            }
            
            if(isSnakeBody(x, y)) {
                sb.append(result + 1);
                break;
            }
            
            if(isApple(x, y)) {
                headForward(x, y);
            }
            
            if(isEmpty(x, y)) {
                headForward(x, y);
                removeTail();
            }
            
            result++;
        }
    }
    
    //----------------------------- print -----------------------------//
    
    private static void print () throws IOException {
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    //----------------------------- private methods -----------------------------//
    
    private static int getDirection (String s) {
        if("D".equals(s)) {
            return 1;
        }
        else {
            return 3;
        }
    }
    
    private static void setDirection () {
        if(second < L && secList[second] == result) {
            direction = (direction + dirList[second]) % 4;
            second++;
        }
    }
    
    private static int moveToX () {
        return snake.getFirst().getX() + dx[direction];
    }
    
    private static int moveToY () {
        return snake.getFirst().getY() + dy[direction];
    }
    
    private static boolean isWall (int x, int y) {
        return x <= 0 || x > N || y <= 0 || y > N;
    }
    
    private static boolean isSnakeBody (int x, int y) {
        return map[x][y] == 2;
    }
    
    private static boolean isApple (int x, int y) {
        return map[x][y] == 1;
    }
    
    private static boolean isEmpty (int x, int y) {
        return map[x][y] == 0;
    }
    
    private static void headForward (int x, int y) {
        map[x][y] = 2;
        snake.addFirst(new Point(x, y));
    }
    
    private static void removeTail () {
        Point tail = snake.removeLast();
        map[tail.getX()][tail.getY()] = 0;
    }
    
    //----------------------------- inner class -----------------------------//
    
    private static class Point {
        
        private int x;
        private int y;
        
        private Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        private int getX () {
            return x;
        }
        
        private int getY () {
            return y;
        }
        
    }
    
}