package baekjoon;

import java.util.Scanner;

public class BOJ_11721 {public static void main(String [] args) {
	
    Scanner sc = new Scanner(System.in);
    String alphabet = sc.next();
    
    sc.close();
    
    for(int i=0; i<alphabet.length(); i++) {
        System.out.print(alphabet.charAt(i));
        if(i % 10 == 9) {
            System.out.println();
	        }
	    }
	}
}
