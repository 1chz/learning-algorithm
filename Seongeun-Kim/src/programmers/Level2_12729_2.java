package programmers;

public class Level2_12729_2 {

    class Solution {
        boolean solution(String s) {

            int count = 0;

            for(char p : s.toCharArray()){

                if(p=='('){
                    count++;
                    continue;
                }

                if(count == 0) return false;
                count--;

            }
            return count == 0;
        }
    }
}
