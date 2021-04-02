package algorithm.BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ts= sc.nextInt();

        for (int t = 0; t < ts; t++) {
            int num = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            int avgnum=0;

            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }
            for(int x : list){
                sum+=x;
            }
            double avg = sum / num;

            for(int x : list){
                if(avg < x)
                    avgnum++;
            }
            double result = (double)avgnum/num*100;
            System.out.println(String.format("%.3f%%", result));

            list.clear();
        }

    }
}
