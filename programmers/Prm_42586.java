package programmers;

import java.util.ArrayList;

public class Prm_42586 {
	public int[] solution(int[] progresses, int[] speeds) {
	    ArrayList<Integer> list = new ArrayList<>();
	    ArrayList<Integer> aList = new ArrayList<>();
	    
	    for(int i=0; i<progresses.length; i++){
	        int pgs = 100 - progresses[i];
	        list.add((int)Math.ceil((double)pgs/speeds[i]));
	    }
	    
	    int j = 0;
	    int count = 1;
	    while(true){
	        if(list.get(j) >= list.get(j+1)){
	            list.remove(j+1);
	            count++;
	        }else{
	            j++;
	            aList.add(count);
	            count = 1;
	        }
	        
	        if(list.size() - 1 == j){
	            aList.add(count);
	            break;
	        }
	    }
	    
	    int[] answer =new  int[aList.size()];
	    for(int i=0; i<aList.size(); i++){
	        answer[i] = aList.get(i);
	    }
	    
	    return answer;
	}

}
