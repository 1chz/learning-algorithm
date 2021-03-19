package backjoon;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class BOJ_5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i=0; i<5;i++){
            total+=sc.nextInt();
        }
        System.out.print(total);
    }
}
