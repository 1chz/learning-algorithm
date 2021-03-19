package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class BOJ_1158 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i=1; i<=a; i++){
            queue.add(i);
        }
        int count =1;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            if (count%b == 0){
                queue2.add(temp);
            }else{
                queue.add(temp);
            }
            count ++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i =0; i<a; i++){
            sb.append(queue2.poll()+", ");
        }
        sb.setLength(sb.length()-2);
        sb.append((">"));
        System.out.println(sb.toString());
    }
}
