package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();

        for(int i=0;i<st.length();i++){
            System.out.print(st.charAt(i));
            if(i%10==9)
                System.out.println();
        }
    }
}
