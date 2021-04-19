package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14681 {

	public static void main(String[] args) {
		try {
			BOJ14681 b = new BOJ14681();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			int quadrant = b.getQuadrant(x, y);
			System.out.println(quadrant);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public int getQuadrant(int x, int y) {
		int q = 0;
		
		if (x > 0) {
			if (y > 0) {
				q = 1;
			} else {
				q = 4;
			}
		} else {
			if (y > 0) {
				q = 2;
			} else {
				q = 3;
			}
		}
		
		return q;
	}

}
