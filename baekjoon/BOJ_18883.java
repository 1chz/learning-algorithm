package baekjoon;

import java.util.Scanner;

public class BOJ_18883 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;

        for(int i=0; i <= n; i++){
            for(int j=0; j <= m; j++){
                if (num % m == 0) {
                    System.out.printf(num + "");
                    num+=1;
                    System.out.println("");
                }
                if(num <= n*m) {
                    System.out.printf(num + "");
                    num++;
                }
            }
        }
        sc.close();
    }
}
