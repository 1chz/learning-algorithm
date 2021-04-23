package baekjoon;

import java.io.*;

public class BOJ_5585 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = 1000 - Integer.parseInt(br.readLine());
		br.close();
		
		Integer[] coinLit = {500, 100, 50, 10, 5, 1};
		int coin = 0;
		for (Integer coinValue : coinLit) {
			while(money >= coinValue) {
				money = money - coinValue;
				coin++;
			}
			if(money == 0) break;
		}
		
		System.out.println(coin);
	}
}
