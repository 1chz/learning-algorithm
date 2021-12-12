package src.practice;

import java.util.Arrays;
    import java.util.Collections;
    import java.util.Map;
    import java.util.TreeMap;
    import java.util.stream.Collectors;

public class PolynomialQuestion {

    public String solution(String exp1, String exp2) {
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (String exp : Arrays.asList(exp1, exp2)) {
            fill(exp, map);
        }

        return map.entrySet().stream()
            .map(entry -> entry.getValue() + "x^" + entry.getKey())
            .collect(Collectors.joining(" + "));
    }

    private void fill(String exp, Map<Integer, Integer> map) {
        for (String e : ExpressionParser.separatePolynomial(exp)) {
            Polynomial polynomial = ExpressionParser.parseToPolynomial(e);

            if (map.containsKey(polynomial.getIndices())) {
                int value = map.get(polynomial.getIndices());
                value += polynomial.getCoefficient();
                map.put(polynomial.getIndices(), value);
                continue;
            }

            map.put(polynomial.getIndices(), polynomial.getCoefficient());
        }
    }

}

class ExpressionParser {

    private static final String SEPARATE_POLYNOMIAL_PATTERN = " \\+ ";
    private static final String POLYNOMIAL_PATTERN = "x\\^";

    static String[] separatePolynomial(String exp) {
        return exp.split(SEPARATE_POLYNOMIAL_PATTERN);
    }

    static Polynomial parseToPolynomial(String exp) {
        String[] split = exp.split(POLYNOMIAL_PATTERN);
        return Polynomial.of(split[0], split[1]);
    }

}

class Polynomial {

    private int coefficient;
    private int indices;

    private Polynomial(int coefficient, int indices) {
        this.coefficient = coefficient;
        this.indices = indices;
    }

    public static Polynomial of(String coefficient, String indices) {
        return new Polynomial(Integer.parseInt(coefficient), Integer.parseInt(indices));
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getIndices() {
        return indices;
    }

}
