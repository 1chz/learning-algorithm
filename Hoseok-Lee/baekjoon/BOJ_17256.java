package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_17256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_x = sc.nextInt();
        int a_y = sc.nextInt();
        int a_z = sc.nextInt();

        int c_x = sc.nextInt();
        int c_y = sc.nextInt();
        int c_z = sc.nextInt();

        int b_x, b_y, b_z;

        //c_x = a.z + b.x
        b_x = c_x - a_z;

        //c_y = a.y × b.y
        b_y = c_y / a_y;

        //c_z = a.x + b.z
        b_z = c_z - a_x;

        System.out.println(b_x+" "+b_y+" "+b_z);
    }
}
