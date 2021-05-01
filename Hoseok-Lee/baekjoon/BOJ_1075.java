package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        n=n/100 * 100;
        int number = 0;
        if(n%f == 0){
            number = 0;
        }else {
            number = f - n%f;
        }

        System.out.println(String.format("%02d",number));

    }
}
