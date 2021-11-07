package src.programmers;

import static java.util.Objects.isNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Prm_42840 {

    public int[] solution(int[] answers) {
        int[][] people = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= 3; i++) {
            int score = score(people[i - 1], answers);
            List<Integer> arr = map.get(score);
            if (isNull(arr)) {
                arr = new ArrayList<>();
            }
            arr.add(i);
            map.put(score, arr);
        }

        List<Integer> scores = new ArrayList<>(map.keySet());
        scores.sort(Collections.reverseOrder());

        List<Integer> top = map.get(scores.get(0));
        int[] answer = new int[top.size()];
        Arrays.setAll(answer, top::get);

        return answer;
    }

    private int score(int[] people, int[] answers) {
        return IntStream.range(0, answers.length)
            .map(isMatch(people, answers))
            .sum();
    }

    private IntUnaryOperator isMatch(final int[] people, final int[] answers) {
        return i -> {
            if (people[i % people.length] == answers[i]) {
                return 1;
            }
            return 0;
        };
    }

}
