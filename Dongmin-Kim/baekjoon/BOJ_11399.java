package greedy50;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int time;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            time = sc.nextInt();
            arr[i] = time;
        }
        Arrays.sort(arr);
        int result = minTime(arr);
        System.out.println(result);

        sc.close();
    }

    public static int minTime(int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i+1; j++){
                sum += arr[j];
            }
        }
        return sum;
    }
}