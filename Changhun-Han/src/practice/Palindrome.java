package src.practice;

public class Palindrome {

    public boolean solution(final String sentence) {
        return sentence.equalsIgnoreCase(
            new StringBuilder(sentence)
                .reverse()
                .toString()
        );
    }

    public boolean solution2(String sentence) {
        sentence = sentence.toLowerCase();
        int len = sentence.length();
        int endIndex = len - 1;
        for (int lt = 0; lt < len / 2; lt++) {
            int rt = endIndex - lt;
            char ltCharAt = sentence.charAt(lt);
            char rtCharAt = sentence.charAt(rt);
            if (ltCharAt != rtCharAt) {
                return false;
            }
        }
        return true;
    }

}
