package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_5554 {
	
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        int x = sum / 60;
        int y = sum % 60;
        
        System.out.println(x);
        System.out.println(y);

    }
}