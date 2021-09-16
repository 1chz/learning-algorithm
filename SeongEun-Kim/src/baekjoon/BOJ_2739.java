package baekjoon;

import java.util.Scanner;

public class BOJ_2739 {

    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=1;i<=9;i++) {
            int result = n * i;
            System.out.println(n+" * "+i+" = "+result);
        }
    }
}

