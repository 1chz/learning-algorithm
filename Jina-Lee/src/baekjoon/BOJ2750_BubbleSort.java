package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Bubble Sort
public class BOJ2750_BubbleSort {

	public static void main(String[] args) {
		try {
			BOJ2750_BubbleSort cl = new BOJ2750_BubbleSort();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++) {
				array[i] = Integer.parseInt(br.readLine());
			}
			
			cl.printARray(cl.sortArray(array));
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int[] sortArray(int[] arr) {
		int tmp = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if(arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}
	
	public void printARray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
