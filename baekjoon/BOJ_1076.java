package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_1076 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		ArrayList<String> colorList = new ArrayList<>(Arrays.asList(arr));
		
		long result = 0;
		
		for(int i=3; i>0; i--) {
			if(i!=1) {
				result += colorList.indexOf(br.readLine()) * Math.pow(10, i-2);
			}else {
				result *= (int)Math.pow(10, colorList.indexOf(br.readLine()));
			}
		}
		
		System.out.println(Long.valueOf(result));
		br.close();
	}
}