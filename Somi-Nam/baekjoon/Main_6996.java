package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/6996
 */
public class Main_6996 {
	
	static String ANAGRAMS = " are anagrams.\n";
	static String NOT_ANAGRAMS = " are NOT anagrams.\n";
	static String AND = " & ";
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		boolean isAnagrams = true;
		for (int i = 0; i < testCase; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			String aString = token.nextToken();
			String bString = token.nextToken();
			
			builder.append(aString).append(AND).append(bString);
			if(aString.length() != bString.length()) {
				builder.append(NOT_ANAGRAMS);
				continue;
			}
			
			ArrayList<Character> a = new ArrayList<>();
			for (int j = 0; j < aString.length(); j++) {
				a.add(aString.charAt(j));
			}
			
			char[] b = bString.toCharArray();
			for (char c : b) {
				if(a.size() == 0 || !a.contains(Character.valueOf(c))) {
					isAnagrams = false;
					break;
				} else a.remove(Character.valueOf(c));
			}
			if(!isAnagrams) builder.append(NOT_ANAGRAMS);
			else builder.append(ANAGRAMS);
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
