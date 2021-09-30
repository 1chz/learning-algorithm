package programmers;

public class Leve1_84331 {
    
    class Solution {
        public int solution(int n) {

            int answer = 0;

            String str = Integer.toBinaryString(n);
            int cnt = 0;

            for(int i=0; i<str.length();i++){
                if(str.charAt(i)=='1')
                    cnt++;
            }

            for(int i=n+1;i<1000000;i++){

                String temp = Integer.toBinaryString(i);
                int temp_cnt = 0;

                for(int j=0; j<temp.length();j++){
                    if(temp.charAt(j)=='1')
                        temp_cnt++;
                }

                if(temp_cnt == cnt){
                    answer = i;
                    break;
                }
            }

            return answer;
        }
    }

}
