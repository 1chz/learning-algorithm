package baekjoon;

import java.util.Calendar;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/16170
 */
public class Main_16170 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}
