import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        
        int result;
        
        if (Math.min(A, B) > Math.min(A, C)){
            result = Math.min(A, C) + Math.min(D, E) - 50;
        } else {
            result = Math.min(A, B) + Math.min(D, E) - 50;
        }
        System.out.println(result);
        sc.close();
    }
}