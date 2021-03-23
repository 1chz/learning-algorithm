package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799 {
    //성공이긴하지만 stack으로만 풀수있도록 연습 필요.
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String [] bars = bufferedReader.readLine().split("");
        Stack stack = new Stack();
        int total =0;
        int bar= 0 ;
        for (int i =0; i<bars.length;i++){
            if(!stack.isEmpty() && stack.peek().equals("(")){
                if(bars[i].equals(")")){
                    bar--;
                    total += bar;
                }
            }
            else if (!stack.isEmpty() && stack.peek().equals(")")){
                if(bars[i].equals(")")){
                    bar --;
                    total +=1;
                }
            }
            if (bars[i].equals("(")){
                bar ++;
            }
            stack.push(bars[i]);
        }
        System.out.println(total);
    }
}