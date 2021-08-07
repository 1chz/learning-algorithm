package section.string.num1;

import java.util.Scanner;

public class AnswerFor1 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 2번 방법
        // .toCharArray()로 새로운 문자배열을 할당해줄 수 있음
        for(char x : str.toCharArray()){
            if(x==t) answer ++;
        }

        // charAt()은 char형을 리턴해준다.
        // 1번 방법
        /*
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == t){
                answer ++;
            }
        }
          */
        return answer;
    }

    public static void main(String[] args){
        AnswerFor1 T = new AnswerFor1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);


        System.out.print(T.solution(str,c));
    }

}
