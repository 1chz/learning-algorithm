package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P12917_test {
    @Test
    @DisplayName("문자열 내림차순으로 배치하기 - 테스트")
    public void test() {
        P12917 problem = new P12917();

        String s = "Zbcdefg";

        String answer1 = "gfedcbZ";

        Assertions.assertEquals(problem.solution(s), answer1);
    }
}
