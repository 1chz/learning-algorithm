package net.acmicpc.problem;

import java.util.Calendar;
import java.util.TimeZone;

public class B16170 {

	public static void main(String[] args) { // 오늘의 날짜는?
		
		TimeZone utc = TimeZone.getTimeZone("UTC");
		Calendar cal = Calendar.getInstance(utc);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//		System.out.println(cal.get(Calendar.MINUTE));
//		System.out.println(cal.get(Calendar.SECOND));
	}

}
