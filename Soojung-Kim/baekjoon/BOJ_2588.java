package baekjoon;

import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String firstNumber = scanner.nextLine();
//        String secondNumber = scanner.nextLine();
//
//        int sum = 0;
//        int point = 0;
//        for (int i = 2; i >= 0; i--) {
//            int tmp = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber.substring(i, i+1));
//            System.out.println(tmp);
//            sum += tmp * (int) Math.pow(10, point);
//            point++;
//        }
//        System.out.print(sum);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber * (secondNumber % 10));
        System.out.println(firstNumber * ((secondNumber % 100) / 10));
        System.out.println(firstNumber * (secondNumber / 100));
        System.out.println(firstNumber * secondNumber);

    }
}
