package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_2562 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i = 1; i < 10; i++) {
            map.put(i, scanner.nextInt());
        }

        int key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1: -1).get().getKey();

        System.out.println(map.get(key));
        System.out.println(key);
    }
}
