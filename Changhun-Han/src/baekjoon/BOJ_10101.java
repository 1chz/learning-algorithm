package src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/10101">
 * https://www.acmicpc.net/problem/10101
 * </a>
 */
public class BOJ_10101 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(sc.nextInt(),
                                                           sc.nextInt(),
                                                           sc.nextInt()
                                                          ));
        
        boolean equilateral = list.stream()
                                  .allMatch(o -> o == 60);
        
        boolean isosceles = list.stream()
                                .distinct()
                                .count() == 2
                            &&
                            list.stream()
                                .mapToInt(Integer :: intValue)
                                .sum() == 180;
        
        boolean scalene = list.stream()
                              .distinct()
                              .count() == 3
                          &&
                          list.stream()
                              .mapToInt(Integer :: intValue)
                              .sum() == 180;
        
        if (equilateral) {
            System.out.println("Equilateral");
        }
        else if (isosceles) {
            System.out.println("Isosceles");
        }
        else if (scalene) {
            System.out.println("Scalene");
        }
        else {
            System.out.println("Error");
        }
        sc.close();
    }
    
}
