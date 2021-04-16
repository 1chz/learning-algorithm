package job.herren;

import java.util.ArrayList;

/**
 * ### 2. 더해서 10이 되는 숫자의 조합을 찾아라
 *
 * 입력된 문자열 중에 더해서 10이 되는 숫자의 조합의 갯수를 출력하시오.
 * (숫자는 모두 한자리 숫자만 사용, 같은 조합은 1번으로 판단, 각 숫자는 한번만 사용 **5,5** 안됨....)
 *
 * input) apdkf35k47n1t2
 * ouput) 5
 * (1,2,3,4 	1,2,7	     1,4,5	 2,3,5	3,7)
 */
public class Herren02 {
    public static int CASE_COUNT = 0;
    public static int N = 10;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        String input = "apdkf35k47n1t2";
        System.out.println("Input) " + input);
        String stringToOnlyDigit = input.replaceAll("[^0-9]","");

        int[] digits = new int[stringToOnlyDigit.length()];
        boolean[] used = new boolean[digits.length];

        for (int i = 0; i < stringToOnlyDigit.length(); i++) {
            digits[i] = (stringToOnlyDigit.charAt(i) - '0');
        }
        subset(0, 0, 0, digits, used);
        System.out.println("10이 되는 숫자의 조합 수 :: " + CASE_COUNT);
    }

    public static void subset (int cnt, int sum, int idx, int[] digits, boolean[] used) {
        if (sum == N) {
//            System.out.println(result);
            CASE_COUNT++;
            return;
        }
        if(cnt >= digits.length) { // 조합 끝
			return;
		}
        for (int i = idx; i < digits.length; i++) {
            if(!used[i]) {
				used[i] = true;
				sum += digits[i];
				result.add(digits[i]);
				subset(cnt + 1, sum, i, digits, used);			//현재 인덱스를 다음 첫 인덱스로 보내준다.
				used[i] = false;
				sum -= digits[i];
				result.remove(result.size() -1);
			}
        }
    }
}
