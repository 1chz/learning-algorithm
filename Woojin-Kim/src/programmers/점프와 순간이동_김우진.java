// 점프와 순간이동
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n != 0){
            ans += n % 2;
            n = n / 2;
        }
        return ans;
    }
}