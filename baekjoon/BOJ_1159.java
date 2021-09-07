package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_1159 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] name = new int[26];
		
		for(int i=0; i<num; i++) {
			name[br.readLine().charAt(0) - 'a']++;
		}
		
		String str = "";
		
		for(int i=0; i<26; i++) {
			if(name[i] >= 5) {
				str += (char)(i+'a');
			}
		}
		
		if(str.equals("")) {
			str = "PREDAJA";
		}
		
		System.out.println(str);
	}
}
