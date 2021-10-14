package programmers;

import java.util.ArrayList;

public class Prm_42840 {
	
	public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = {0, 0, 0};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == st1[i%st1.length]) {score[0]++;}
            if(answers[i] == st2[i%st2.length]) {score[1]++;}
            if(answers[i] == st3[i%st3.length]) {score[2]++;}
        }
        
        int max = Math.max(Math.max(score[0], score[1]), score[2]);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(max == score[0]) {list.add(1);}
        if(max == score[1]) {list.add(2);}
        if(max == score[2]) {list.add(3);}
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
