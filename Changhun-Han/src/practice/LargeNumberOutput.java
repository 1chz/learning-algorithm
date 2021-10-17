package src.practice;

import static java.util.Arrays.stream;

public class LargeNumberOutput {

    public String solution(final int numCount, final String testCase) {
        int[] nums = stream(testCase.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        String answer = String.valueOf(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                answer = answer + " " + nums[i];
            }
        }

        return answer;
    }

}
