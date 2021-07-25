package practice;

import java.util.Scanner;

import static java.util.Arrays.stream;

/**
 * 입력받은 문자열을 뒤집으려면 어떻게 해야 할까?
 */
public class StringReverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("입력할 단어는 몇 개 입니까?");
            int count = sc.nextInt();
            sc.nextLine();

            String[] strings = new String[count];
            for (int i = 0; i < strings.length; i++) {
                System.out.println("단어를 입력하세요");
                strings[i] = sc.nextLine();
            }

            stream(solution(strings)).forEach(System.out::println);
        }
    }

    public static String[] solution(String[] words) {
        return stream(words)
                .map(it -> new StringBuilder(it).reverse().toString())
                .toArray(String[]::new);
    }
}
