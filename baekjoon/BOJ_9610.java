package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9610 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x, y;
		
		int num = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			map.put(x==0||y==0 ? "AXIS" : x>0 ? y>0 ? "Q1" : "Q4" : y>0 ? "Q2" : "Q3",
				    map.getOrDefault(x==0||y==0 ? "AXIS" : x>0 ? y>0 ? "Q1" : "Q4" : y>0 ? "Q2" : "Q3", 0) + 1);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}
