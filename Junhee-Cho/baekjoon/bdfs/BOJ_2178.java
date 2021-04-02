package baekjoon.bdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2178">
 * https://www.acmicpc.net/problem/2178 미로 탐색
 * </a>
 */
public class BOJ_2178 {
    private static String DELIMITER = "";

    private static int[][] getMaze() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][m];
        for (int i = 0; i < maze.length; i++) {
            maze[i] = Arrays.stream(br.readLine().split(DELIMITER))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        br.close();
        return maze;
    }

    public static void main(String[] args) throws IOException {
        int[][] maze = getMaze();
        System.out.println(new Solution().shortestPath(maze));
    }
}

class Solution{
    int shortestPath(int[][] maze) {
        if(maze[0][0] == 0 || maze[maze.length - 1][maze[0].length - 1] == 0) throw new IllegalStateException("답 없음");
        // 맨처음 -> -1로 세팅
        // bfs탐색하는 횟수마다 -2, -3 으로 거리를 매김
        // maze의 맨 끝이 -15라면 15가 답

        maze[0][0] = -1;
        Queue<Position> queue = new LinkedList();
        queue.offer(new Position(0, 0));

        while(!queue.isEmpty()){
            Position position = queue.poll();

            // 현재 위치(position)로부터 사방을 돌면서 1이 보이면 queue에 넣고 그자리에
            // 이전값 -1 한 값을 넣음
            for(Direction direction : Direction.values()){
                final int movedRow = position.getRow() + direction.getRow();
                final int movedColumn = position.getColumn() + direction.getColumn();

                if(movableWay(maze, movedRow, movedColumn)){
                    queue.offer(new Position(movedRow, movedColumn));
                    maze[movedRow][movedColumn] = maze[position.getRow()][position.getColumn()] - 1;
                }
            }
        }

        return Math.abs(maze[maze.length - 1][maze[0].length - 1]);
    }

    private boolean movableWay(int[][] maze, int movedRow, int movedColumn) {
        return movedRow >= 0 && movedColumn >= 0
                && movedRow < maze.length && movedColumn < maze[0].length
                && maze[movedRow][movedColumn] == 1;
    }

    enum Direction {
        Down(1, 0),
        Right(0, 1),
        Up(-1, 0),
        Left(0, -1);

        private int row;
        private int column;

        Direction(int row, int column){
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

    class Position {
        private final int row;
        private final int column;

        Position(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }
}

