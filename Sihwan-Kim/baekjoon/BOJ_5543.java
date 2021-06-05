package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://www.acmicpc.net/problem/5543">
 * https://www.acmicpc.net/problem/5543
 * </a>
 */
public class BOJ_5543 {
    public static void main(String[] args) throws NumberFormatException, IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	List<Integer> bugers = new ArrayList<Integer>();
    	List<Integer> beverages = new ArrayList<Integer>();
    	for(int i=0; i<5; i++) {
    		int parseInt = Integer.parseInt(br.readLine());
    		if(i < 3) {
    			bugers.add(parseInt);
    		}else {
    			beverages.add(parseInt);
    		}
    	}
    	
    	Collections.sort(bugers);
    	Collections.sort(beverages);
    	
    	Integer buger = bugers.get(0);
    	Integer beverage = beverages.get(0);
    	
    	System.out.println(buger + beverage - 50);
    }
}