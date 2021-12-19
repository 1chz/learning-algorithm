package src.programmers;

import static java.util.Arrays.stream;
import java.util.Set;
import java.util.stream.Collectors;

public class Prm_77484 {

    public static final int[] RANK = {6, 6, 5, 4, 3, 2, 1};

    public int[] solution(int[] lottos, int[] winNums) {
        Set<Integer> lottoSet = stream(lottos)
            .boxed()
            .collect(Collectors.toUnmodifiableSet());

        int countOfZero = (int) stream(lottos)
            .filter(this::isZero)
            .count();

        int matchCount = (int) stream(winNums)
            .filter(lottoSet::contains)
            .count();

        return new int[]{RANK[countOfZero + matchCount], RANK[matchCount]};
    }

    private boolean isZero(int num) {
        return num == 0;
    }

}
