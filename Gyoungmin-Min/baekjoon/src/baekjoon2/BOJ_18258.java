package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_18258 {
    public static int que [] = new int[2000000];
    public static int size =0;
    public static int front =0;
    public static int back =0;

    public static void push(int x){
        que[back] = x;
        size++;
        back++;
    }
    public static int pop(){
        if (size == 0){
            return -1;
        }else{
            int x = que[front];
            size--;
            front++;
            return x;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if (size ==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int front(){
        if (size ==0){
            return -1;
        }else{
            return que[front];
        }
    }
    public static int back(){
        if (size ==0){
            return -1;
        }else{
            return que[back-1];
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<N; i++){
            String command[] = br.readLine().split(" ");
            switch (command[0]){
                case "push":
                    push(Integer.parseInt(command[1]));
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());

    }
}
