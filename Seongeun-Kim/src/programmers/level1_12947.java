package programmers;

public class level1_12947 {

    class Solution {
        public boolean solution(int x) {

            boolean answer = true;
            int test = 0;
            String [] xArr = (x+"").split("");

            for(int i=0;i<xArr.length;i++){
                test += Integer.parseInt(xArr[i]);
            }

            return x % test == 0 ? true:false;
        }
    }
}
