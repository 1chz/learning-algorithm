package src.programmers;

public class Prm_81301 {
    int solution(String question) {
        if (isDigitAll(question)) {
            return Integer.parseInt(question);
        }

        for (Numbers number : Numbers.values()) {
            question = question.replace(number.getRegex(), number.getReplacement());
            if (isDigitAll(question)) {
                return Integer.parseInt(question);
            }
        }
        return Integer.parseInt(question);
    }

    private boolean isDigitAll(String question) {
        return question.chars()
            .allMatch(Character::isDigit);
    }

    private enum Numbers {
        ZERO("0"),
        ONE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9");

        private final String replacement;

        Numbers(String replacement) {
            this.replacement = replacement;
        }

        private String getRegex() {
            return this.name()
                .toLowerCase();
        }

        private String getReplacement() {
            return replacement;
        }
    }
}
