package section.string.num2;

import java.util.Scanner;

public class AnswerFor2 {
    public String solution(String str){
        String answer ="";

        for(char x: str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        AnswerFor2 T = new AnswerFor2();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
