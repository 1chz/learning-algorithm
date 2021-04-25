package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8958 {

	public static void main(String[] args) {
		try {
			BOJ8958 cl = new BOJ8958();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i <= n; i++) {
				System.out.println(cl.returnScore(br.readLine()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int returnScore(String str) {
		int score = 0;
		
		int tmpScore = 0;
		String[] arr = new String[str.length()];
		arr = str.split("");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("O")) {
				tmpScore++;
				score += tmpScore;
			} else {
				tmpScore = 0;
			}
		}
		
		return score;
	}

}
