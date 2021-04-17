import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = false;

        for(int i=0; i<num.length; i++) {
          num[i] = sc.nextInt();

          if(num[i] % 2 == 1) {
            flag = true;
            sum += num[i];
            if(min>num[i]) {
              min = num[i];
            }
          }
        }
        
        if(flag){
          System.out.println(sum);
          System.out.println(min);
        }

        if(!flag){
          System.out.println(-1);  
        }
        sc.close();
    }
}