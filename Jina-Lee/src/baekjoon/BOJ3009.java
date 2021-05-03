package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BOJ3009 {

	public static void main(String[] args) {
		try {
			BOJ3009 cl = new BOJ3009();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] arr = new String[3];
			for(int i = 0; i < 3; i++) {
				arr[i] = br.readLine();
			}
			
			System.out.println(cl.returnLastPoint(arr));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public String returnLastPoint(String[] arr) {
		String lastX = "";
		String lastY = "";
		Map<String, Boolean> points = new HashMap<>();
		
		for (String s : arr) {
			String x = "x" + s.split(" ")[0];
			String y = "y" + s.split(" ")[1];
			
			if (points.containsKey(x)) {
				points.remove(x);
			} else {
				points.put(x, true);
			}
			
			if (points.containsKey(y)) {
				points.remove(y);
			} else {
				points.put(y, true);
			}
		}
		
		Set<String> keySet = points.keySet();
		for (String key : keySet) {
			if (key.startsWith("x")) {
				lastX = key.substring(1);
			}
			if (key.startsWith("y")) {
				lastY = key.substring(1);
			}
		}
		
		
		return lastX + " " + lastY;
	}

}
