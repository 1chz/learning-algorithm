package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[8];
        int result = 0;

        for (int i = 0; i < 8; i++) {
            str[i]= sc.next();
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j)%2==0 && str[i].charAt(j)=='F'){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
