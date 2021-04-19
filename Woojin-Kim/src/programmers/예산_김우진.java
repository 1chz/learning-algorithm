// 예산
import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int money : d) {
            sum += money;
            answer++;
            if(sum > budget)
                return answer-1;
        }
        return answer;
    }
}