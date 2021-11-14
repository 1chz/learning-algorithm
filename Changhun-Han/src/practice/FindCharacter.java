package src.practice;

import java.util.Scanner;

import static java.util.stream.IntStream.range;

/**
 * 입력받은 문자열에서 원하는 문자가 몇개 존재하는지 확인하려면 어떻게 해야 할까?
 * 단, 문자는 대소문자를 구분하지 않는다.
 */
public class FindCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("문자열을 입력하세요");
            String str = sc.nextLine();

            System.out.println("문자를 입력하세요");
            char c = sc.next().charAt(0);

            System.out.println("찾는 문자의 개수 = " + solution(str, c));
        }
    }

    public static int solution(String str, char c) {
        String upperCaseStr = str.toUpperCase();
        char upperCaseChar = Character.toUpperCase(c);
        return (int) range(0, upperCaseStr.length())
                .filter(i -> upperCaseStr.charAt(i) == upperCaseChar)
                .count();
    }
}
