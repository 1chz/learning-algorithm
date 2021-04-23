package programmers;

import java.util.Arrays;
import java.util.Collections;

public class P12917 {
    public String solution(String s) {

        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        return String.join("", arr);
    }
}
