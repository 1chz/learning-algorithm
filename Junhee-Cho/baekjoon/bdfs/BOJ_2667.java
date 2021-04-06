package baekjoon.bdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2667">
 * https://www.acmicpc.net/problem/2667 단지번호붙이기
 * </a>
 */

/*
5
01101
01101
11100
00011
00100

4
1
2
2
7
 */
public class BOJ_2667 {
    private static String DELIMITER = "";

    private static int[][] getMaze() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int n = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][n];
        for (int i = 0; i < maze.length; i++) {
            maze[i] = Arrays.stream(br.readLine().split(DELIMITER))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        br.close();
        return maze;
    }

    public static void main(String[] args) throws IOException {
        final int[][] maze = getMaze();
        List<Integer> result = new Solution2667().result(maze);
        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}


class Solution2667{
    List<Integer> result(int[][] maze){
        Queue<Position> queue = new LinkedList<>();
        ArrayList<Integer> houses = new ArrayList<>();

        // 0,0 -> 마지막까지 순회하면서 1을 찾는다.
        // 1을 찾으면 bfs를 태워서 houes에 단지 수를 add한다.
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(maze[i][j] == 1){
                    queue.offer(new Position(i, j));
                    bfs(maze, queue, houses);
                }
            }
        }
        Collections.sort(houses);
        return houses;
    }

    private void bfs(int[][] maze, Queue<Position> queue, ArrayList<Integer> houses) {
        int count = 1;
        while(!queue.isEmpty()){
            Position position = queue.poll();

            // 현재 위치(position)로부터 사방을 돌면서 1이 보이면 queue에 넣고 그자리에
            // -1값을 넣음

            maze[position.getRow()][position.getColumn()] = -1;
            for(Direction direction : Direction.values()){
                final int movedRow = position.getRow() + direction.getRow();
                final int movedColumn = position.getColumn() + direction.getColumn();

                if(movableWay(maze, movedRow, movedColumn)){
                    count++;
                    queue.offer(new Position(movedRow, movedColumn));
                    maze[movedRow][movedColumn] = - 1;
                }
            }
        }
        houses.add(count);
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

        int getRow() {
            return row;
        }

        int getColumn() {
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

        int getRow() {
            return row;
        }

        int getColumn() {
            return column;
        }
    }
}
