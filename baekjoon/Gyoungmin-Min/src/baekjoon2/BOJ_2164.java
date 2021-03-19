package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BOJ_2164 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList cards = new LinkedList<>();
        for (int i =1; i<=N;i++){
            cards.add(i);
        }
        int i=0;
        while (cards.size() >1){
            if(i%2 ==0){
                cards.poll();
            }else{
                cards.add(cards.poll());
            }
            i++;
        }
        System.out.println(cards.poll());

    }
}
