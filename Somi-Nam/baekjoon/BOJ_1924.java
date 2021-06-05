package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/1924">
 * https://www.acmicpc.net/problem/1924 2007³â
 * </a>
 */
public class BOJ_1924 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		br.close();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		int sumDay = 0;
		for (int i = 0; i < Integer.parseInt(input[0]) - 1; i++) {
			sumDay += month[i];
		}
		sumDay += Integer.parseInt(input[1]);
		System.out.println(day[sumDay % 7]);
	}
	
	// using java Calendar
//	public enum WEEK {
//		SUN,MON,TUE,WED,THU,FRI,SAT;
//	}
//	public void usingCalendar(String[] input) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(2007, Integer.parseInt(input[0]) - 1, Integer.parseInt(input[1]));
//		
//		System.out.println(WEEK.values()[cal.get(Calendar.DAY_OF_WEEK) - 1].name());
//	}
}
