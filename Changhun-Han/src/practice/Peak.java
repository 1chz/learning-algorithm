package src.practice;

public class Peak {

    private static final int[] DX = {-1, 0, 1, 0};
    private static final int[] DY = {0, 1, 0, -1};

    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rotate(n, arr, i, j)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private boolean rotate(int n, int[][] numbers, int i, int j) {
        for (int k = 0; k < 4; k++) {
            int nx = i + DX[k];
            int ny = j + DY[k];

            // 12, 3, 6, 9시 방향. 네가지 경우의 수 중 단 하나라도 충족하지 않는 경우 false를 반환한다
            if ((nx >= 0) && (nx < n) && (ny >= 0) && (ny < n) && (numbers[i][j] <= numbers[nx][ny])) {
                return false;
            }
        }
        // 네가지 경우의 수가 모두 참인 경우 answer를 1증가시킨다.
        return true;
    }

}
