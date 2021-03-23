package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_5543 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> buggers = new ArrayList<>();
        buggers.add(scanner.nextInt());
        buggers.add(scanner.nextInt());
        buggers.add(scanner.nextInt());

        List<Integer> drink = new ArrayList<>();
        drink.add(scanner.nextInt());
        drink.add(scanner.nextInt());

        System.out.println(Collections.min(buggers) + Collections.min(drink) - 50);
    }
}
