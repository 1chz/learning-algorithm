package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        while (sc.hasNext()){
            a=sc.nextInt();
            b=sc.nextInt();

            if(a==0)
                break;

            if(b%a==0){
                System.out.println("factor");
            }else if(a%b==0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }

    }
}
