package src.practice;

public class GridMaxSum {

    public int solution(final int n, final int[][] arr) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sumOfRows = 0;
            int sumOfColumns = 0;
            for (int j = 0; j < n; j++) {
                sumOfRows += arr[i][j];
                sumOfColumns += arr[j][i];
            }
            answer = Math.max(answer, sumOfRows);
            answer = Math.max(answer, sumOfColumns);
        }

        int rightDownDiagonal = 0;
        int leftDownDiagonal = 0;
        for (int i = 0; i < n; i++) {
            rightDownDiagonal += arr[i][i];
            leftDownDiagonal += arr[i][n - i - 1];
        }
        answer = Math.max(answer, rightDownDiagonal);
        answer = Math.max(answer, leftDownDiagonal);

        return answer;
    }

}
