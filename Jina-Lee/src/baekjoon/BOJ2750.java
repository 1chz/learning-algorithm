package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Insertion Sort
public class BOJ2750 {

	public static void main(String[] args) {
		try {
			BOJ2750 cl = new BOJ2750();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			
			int[] sorted = new int[n];
			sorted = Arrays.copyOf(cl.sortArr(arr), n);
			cl.printArr(sorted);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public int[] sortArr(int[] arr) {
		int ind = 0;
		int tmp = 0;
		for (int i = 1; i < arr.length; i++) {
			ind = i;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[ind] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[ind];
					arr[ind] = tmp;
					ind--;
				} else {
					break;
				}
			}
		}
		
		return arr;
	}
	
	public void printArr(int[] arr) {
		for(int a : arr) System.out.println(a);
	}

}
