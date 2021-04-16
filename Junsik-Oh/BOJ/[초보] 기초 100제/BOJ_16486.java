


import java.util.Scanner;

public class BOJ_16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double pi = 3.141592f;

        double answer = (a * 2) + (2 * pi * b);

        System.out.printf("%f", answer);

    }


}
