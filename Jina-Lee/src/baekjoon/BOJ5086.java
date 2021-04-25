package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {
	
	private static String factor = "factor";
	private static String multiple = "multiple";
	private static String neither = "neither";

	public static void main(String[] args) {
		try {
			BOJ5086 cl = new BOJ5086();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			while(null != (line = br.readLine())) {
				StringTokenizer st = new StringTokenizer(line, " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				if (x == 0 && y == 0) {
					break;
				}
				System.out.println(cl.returnFactorsAndMultiples(x, y));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String returnFactorsAndMultiples(int x, int y ) {
		String result = "";
		
		if (x == 0 || y == 0) {
			result = neither;
		} else if (x / y > 0) {
			if (x % y != 0) {
				result = neither;
			} else {
				result = multiple;
			}
		} else if (y / x > 0) {
			if (y % x != 0) {
				result = neither;
			} else {
				result = factor;
			}
		}
		
		return result;
	}

}
