package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int stationNum;
		int[] passenger_in;
		int[] passenger_out;
		
//		System.out.println("�������� ���� �߹߿����� ž���ϴ� ����� �� �� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		stationNum=sc.nextInt();
		
		passenger_in=new int[stationNum+1];
		passenger_out=new int[stationNum+1];

		passenger_in[0]=sc.nextInt();
		passenger_out[0]=0;
		
		for(int i=1;i<stationNum+1;i++) {
//			System.out.print(i+"��° �������� ž���ο��� �����ο��� �Է��Ͻÿ�");
			passenger_in[i]=sc.nextInt();
			passenger_out[i]=sc.nextInt();
		}
		
		System.out.println("�����");
		sc.close();
	}
}
