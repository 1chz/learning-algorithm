package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10866 {
    public static int deque [] = new int[20001];
    public static int front = 10000;
    public static int size = 0;
    public static int back = 10001;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command){
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }


        }
        System.out.println(sb.toString());
    }
    public static void push_front(int x){
        deque[front] = x;
        front--;
        size++;
    }
    public static void push_back(int x){
        deque[back] = x;
        back++;
        size++;
    }
    public static void pop_front(){
        if (size ==0){
            sb.append(-1).append("\n");
        }else{
            sb.append(deque[front+1]).append("\n");
            front++;
            size--;
        }
    }
    public static void pop_back(){
        if (size ==0){
            sb.append(-1).append("\n");
        }else{
            sb.append(deque[back-1]).append("\n");
            back--;
            size--;
        }
    }
    public static void size(){
        sb.append(size).append("\n");
    }
    public static void empty(){
        if(size ==0){
            sb.append("1\n");
        }else{
            sb.append("0\n");
        }
    }
    public static void front(){
        if(size ==0){
            sb.append("-1\n");
        }else{
            sb.append(deque[front+1]).append("\n");
        }
    }
    public static void back(){
        if(size ==0){
            sb.append("-1\n");
        }else{
            sb.append(deque[back-1]).append("\n");
        }
    }

}
