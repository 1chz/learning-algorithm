package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []h =new int[3];
        int []d = new int[2];

        h[0] = sc.nextInt();
        h[1] = sc.nextInt();
        h[2] = sc.nextInt();
        d[0] = sc.nextInt();
        d[1] = sc.nextInt();

        int h_min=2000, d_min=2000;
        int sum=0;

        for (int i = 0; i < 3; i++) {
            h_min=Math.min(h_min, h[i]);
        }
        for (int i = 0; i < 2; i++) {
            d_min=Math.min(d_min, d[i]);
        }
        System.out.println(h_min+d_min-50);
    }
}
