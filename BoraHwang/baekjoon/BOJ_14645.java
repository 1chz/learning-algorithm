package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int stationNum;
		int[] passenger_in;
		int[] passenger_out;
		
//		System.out.println("정거장의 수와 추발역에서 탑승하는 사람의 수 를 입력하시오");
		Scanner sc = new Scanner(System.in);
		stationNum=sc.nextInt();
		
		passenger_in=new int[stationNum+1];
		passenger_out=new int[stationNum+1];

		passenger_in[0]=sc.nextInt();
		passenger_out[0]=0;
		
		for(int i=1;i<stationNum+1;i++) {
//			System.out.print(i+"번째 정류장의 탑승인원과 하차인원을 입력하시오");
			passenger_in[i]=sc.nextInt();
			passenger_out[i]=sc.nextInt();
		}
		
		System.out.println("비와이");
		sc.close();
	}
}
