// 숫자 게임
import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        boolean[] visit = new boolean[B.length];
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.fill(visit, false);
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < B.length; j++) {
                if(A[i] > B[j])
                    continue;
                if(!visit[j] && B[j] > A[i]){
                    visit[j] = true;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}