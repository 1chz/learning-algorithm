package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ts = sc.nextInt();
        for (int t = 0; t < ts; t++) {
            String st = sc.next();
            int c = 0;
            int result = 0;

            for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i)=='O'){
                    result+=++c;
                }else{
                    c=0;
                }
            }
            System.out.println(result);
        }

    }
}
