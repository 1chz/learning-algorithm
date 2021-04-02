package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_14681 {
	
    public static void main(String[] args) throws Exception {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(y > 0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
    }
}