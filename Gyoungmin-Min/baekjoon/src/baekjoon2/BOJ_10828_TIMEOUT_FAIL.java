package baekjoon2;

 import java.io.BufferedReader;
 import java.util.Scanner;

public class BOJ_10828_TIMEOUT_FAIL {
    static int []stack = new int[10000];
    static int index =1;
    public static void push(int x){
        stack[index] = x;
        index++;
    }
    public static void pop(){
        int x;
        if (stack[index-1]== 0){
            System.out.println(-1);
        }else{
            x = stack[index-1];
            stack[index-1] = 0;
            index--;
            System.out.println(x);
        }
    }
    public static void size(){
        System.out.println(index-1);
    }
    public static void empty(){
        if (index == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static void top(){
        int x;
        if (stack[index-1] == 0){
            System.out.println(-1);
        }else{
            x = stack[index-1];
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(System.in);
        // 입, 출력시간 단축 필요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0; i<N;i++){
            String [] command = sc.nextLine().split(" ");
            switch (command[0]){
                case "push":
                    push(Integer.parseInt(command[1]));
                    break;
                case "top":
                    top();
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
            }

        }
    }
}
