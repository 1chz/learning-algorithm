package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1159
 */
public class Main_1159 {
	static String PREDAJA = "PREDAJA";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> nameList = new HashMap<>();
		String first = "";
		String name = "";
		for (int i = 0; i < n; i++) {
			name = br.readLine();
			first = name.substring(0, 1);
			if(!nameList.containsKey(first)){
				nameList.put(first, 1);
			} else {
				nameList.put(first, nameList.get(first)+1);
			}
		}
		
		ArrayList<String> nameArray = new ArrayList<>();
		for (String firstName : nameList.keySet()) {
			if(nameList.get(firstName) >= 5) {
				nameArray.add(firstName);
			}
		}
		
		StringBuilder builder = new StringBuilder();
		if(nameArray.size() == 0) {
			builder.append(PREDAJA);
		} else {
			Collections.sort(nameArray);
			for (String string : nameArray) {
				builder.append(string);
			}
		}
		
		bw.write(builder.toString());
		
		bw.close();
		br.close();
	}
}
