import java.util.Scanner;

import static java.lang.Math.round;

public class BOJ_2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt() - 1 ;

        double c = (a* b) ;




        System.out.println(round(c) + 1);

    }
}
