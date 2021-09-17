package baekjoon;

import java.util.Scanner;

public class BOJ_1100 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chase = new String[8];
        int cnt = 0;

        for (int i = 0; i < chase.length; i++) {
            chase[i] = sc.next();
            if (i % 2 == 0) {
                for (int j = 0; j < chase[i].length(); j++) {
                    if (j % 2 == 0 && chase[i].charAt(j) == 'F')
                        cnt++;
                }
            }
            else {
                for (int j = 0; j < chase[i].length(); j++) {
                    if (j % 2 == 1 && chase[i].charAt(j) == 'F')
                        cnt++;
                }
            }
        }
        sc.close();
        System.out.print(cnt);
    }
}
