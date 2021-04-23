package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();


        String[] strSplit = str.split(" ");


        if(str.equals(" ")){
            System.out.println(0);
        }
        else if (str.charAt(0)==' '){
            System.out.println(strSplit.length-1);
        }else{
            System.out.println(strSplit.length);
        }
    }
}
