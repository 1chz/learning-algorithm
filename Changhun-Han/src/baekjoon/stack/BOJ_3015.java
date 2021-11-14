package src.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/3015">
 * https://www.acmicpc.net/problem/3015
 * </a>
 */
public class BOJ_3015 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<People> stack = new Stack<>();
        int N = parseInt(br.readLine());
        long count = 0;

        for (int i = 0; i < N; i++) {

            int height = parseInt(br.readLine());

            while (!stack.empty() && stack.peek().height < height) {
                count += stack.peek().numberOfPeople;
                stack.pop();
            }

            if (stack.empty()) {
                stack.push(new People(height, 1));
            }
            else {
                if (stack.peek().height == height) {
                    People people = stack.pop();
                    count += people.numberOfPeople;
                    if (!stack.empty()) {
                        count++;
                    }
                    people.numberOfPeople++;
                    stack.push(people);
                }
                else {
                    stack.push(new People(height, 1));
                    count++;
                }
            }
        }

        System.out.println(count);
        br.close();

    }

    static class People {

        int height;
        int numberOfPeople;

        People (int height, int numberOfPeople) {
            this.height = height;
            this.numberOfPeople = numberOfPeople;
        }

    }

}



