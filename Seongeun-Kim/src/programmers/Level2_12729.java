package programmers;

public class Level2_12729 {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;

            int open = 0;
            if(s.charAt(0)==')') return false;

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    open++;
                }else{
                    if(open<=0) return false;
                    open--;
                }
            }

            if(open!=0)return false;
            return answer;
        }
    }
}
