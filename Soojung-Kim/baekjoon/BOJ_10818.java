package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class BOJ_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = Integer.parseInt(str);
        str = scanner.nextLine();

        int[] numbers = Arrays.asList(str.split(" ")).stream().mapToInt(Integer::parseInt).sorted().toArray();
//        String[] numbersAsStr = str.split(" ");
//        Integer[] numbers = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(numbers);
        System.out.println(numbers);
        StringBuilder sb = new StringBuilder();
        sb.append(numbers[0]);
        sb.append(" ");
        sb.append(numbers[numbers.length - 1]);
        System.out.print(sb.toString());

//        for (int i = 0; i < n; i++) {
//            str = scanner.nextLine();
//            list.add(str);
//        }

//        Collections.sort(list);
//        System.out.println(list);
//
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(list.get(0));
//        sb.append(" ");
//        sb.append(list.get(list.size() - 1));
//        System.out.println(sb.toString());
    }
}
