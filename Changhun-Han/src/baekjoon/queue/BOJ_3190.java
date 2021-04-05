package baekjoon.queue;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/3190">
 * https://www.acmicpc.net/problem/3190
 * </a>
 */
public class BOJ_3190 {
    
    /**
     * Map 구조 <br/>
     * 0 : 아무것도 없음 <br/>
     * 1 : 사과 <br/>
     * 2 : 뱀 <br/>
     */
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static StringBuilder sb;

    private static Deque<Point> snake = new ArrayDeque<>();

    private static int N;
    private static int K;
    private static int L;

    private static int[][] map;
    private static int[] secList;
    private static int[] dirList;

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    private static int direction = 1;
    private static int second = 0;
    private static int result = 0;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();

        N = parseInt(br.readLine());
        K = parseInt(br.readLine());
        map = new int[N + 1][N + 1];

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = parseInt(st.nextToken());
            int col = parseInt(st.nextToken());
            map[row][col] = 1;
        }

        L = parseInt(br.readLine());
        secList = new int[L];
        dirList = new int[L];

        for (int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            secList[i] = parseInt(st.nextToken());
            dirList[i] = getDirection(st.nextToken());
        }

        solution();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void solution () {

        map[1][1] = 2;
        snake.add(new Point(1, 1));

        while (true) {
            // TODO: 방향 설정
            turnAround();

            // TODO: 머리가 다음칸으로 이동하며 몸통이 늘어남
            int nextX = snake.getFirst()
                    .getX() + dx[direction];

            int nextY = snake.getFirst()
                    .getY() + dy[direction];

            // TODO: 머리가 벽과 부딪히면 종료
            if (nextX <= 0 || nextX > N || nextY <= 0 || nextY > N) {
                sb.append(result + 1);
                break;
            }

            // TODO: 머리가 몸통과 부딪히면 종료
            if (map[nextX][nextY] == 2) {
                sb.append(result + 1);
                break;
            }

            // TODO: 이동한 칸에 사과가 있다면, 사과를 먹고 꼬리를 유지
            if (map[nextX][nextY] == 1) {
                headForward(nextX, nextY);
            }

            // TODO: 이동한 칸에 사과가 없다면, 꼬리를 자름
            else if (map[nextX][nextY] == 0) {
                headForward(nextX, nextY);
                removeTail();
            }

            result++;
        }
    }

    private static void turnAround() {
        if (second < L && secList[second] == result) {
            direction = (direction + dirList[second]) % 4;
            second++;
        }
    }

    private static int getDirection(String s) {
        if ("D".equals(s)) {
            return 1;
        } else {
            return 3;
        }
    }

    private static void headForward(int nextX, int nextY) {
        map[nextX][nextY] = 2;
        snake.addFirst(new Point(nextX, nextY));
    }

    private static void removeTail() {
        Point tail = snake.removeLast();
        map[tail.getX()][tail.getY()] = 0;
    }

    private static class Point {

        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int getX() {
            return x;
        }

        private int getY() {
            return y;
        }

    }
    
}