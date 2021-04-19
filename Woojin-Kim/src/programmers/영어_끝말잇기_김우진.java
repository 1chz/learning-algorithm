// 영어 끝말잇기

import java.util.ArrayList;

class Solution {
    
    public boolean checkRule(String word, ArrayList<String> history) {
        String prevWord;
        if(!history.isEmpty()) {
            prevWord = history.get(history.size()-1);
        }else{
            prevWord = String.valueOf(word.charAt(0));
        }
        if(history.contains(word) || word.charAt(0) != prevWord.charAt(prevWord.length()-1) || word.length() == 1)
            return true;
        return false;
    }
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> history = new ArrayList<>();
        int count = 1;
        for (String word : words) {
            if(checkRule(word, history)){
                if(count % n == 0)
                    answer[0] = n;
                else
                    answer[0] = count % n;
                if(count % n == 0)
                    answer[1] = count / n;
                else
                    answer[1] = (count / n) + 1;
                break;
            }
            history.add(word);
            count++;
        }
        return answer;
    }
}