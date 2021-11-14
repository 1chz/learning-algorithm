package src.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42586?language=java">
 * https://programmers.co.kr/learn/courses/30/lessons/42586?language=java
 * </a>
 */
public class Prm_42586 {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] solution = solution(progresses, speeds);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int deployDay = calcDeployDay(progresses[0], speeds[0]);
        int count = 1;

        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < progresses.length; i++) {
            if (deployDay >= calcDeployDay(progresses[i], speeds[i])) {
                count++;
            } else {
                answer.add(count);
                deployDay = calcDeployDay(progresses[i], speeds[i]);
                count = 1;
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static int calcDeployDay(int i1, int i2) {
        return (int) Math.ceil((100.0 - i1) / i2);
    }
}
