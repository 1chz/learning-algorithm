package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n; j++) {
                //홀수번째 줄
                if(i%2==0){
                    if(j%2==0){
                        System.out.printf("*");
                    }else {
                        System.out.printf(" ");
                    }
                }
                //짝수번째 줄
                else{
                    if(j%2==0){
                        System.out.printf(" ");
                    }else {
                        System.out.printf("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
