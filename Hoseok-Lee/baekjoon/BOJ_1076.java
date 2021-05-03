package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String[] r = new String[3];
        int[] n = new int[3];
        long result = 0;

        for (int i = 0; i < 3; i++) {
            r[i] = sc.next();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if(r[i].equals(color[j])){
                    n[i]=j;
                    break;
                }
            }
        }
        result= (long) ((n[0]*10+n[1]) * Math.pow(10, n[2]));

        System.out.println(result);
    }
}
